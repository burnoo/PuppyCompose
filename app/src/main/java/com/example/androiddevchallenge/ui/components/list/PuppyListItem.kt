/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.components.list

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.data.puppies

@Preview(backgroundColor = 0xFFFFFF, showBackground = true)
@Composable
fun ListItem(navController: NavHostController? = null, puppy: Puppy = puppies.first()) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                navController?.currentBackStackEntry
                    ?.arguments
                    ?.putParcelable("puppy", puppy)
                navController?.navigate("details")
            }
    ) {
        ListImage(puppy)
        Text(text = puppy.name, style = MaterialTheme.typography.h5)
    }
}

@Preview(backgroundColor = 0xFFFFFF, showBackground = true)
@Composable
fun ListImage(puppy: Puppy = puppies.first()) {
    val shape = RoundedCornerShape(8.dp)

    Image(
        painter = painterResource(id = puppy.imageRes),
        contentDescription = "Puppy ${puppy.name}",
        modifier = Modifier
            .padding(12.dp)
            .border(
                width = 1.dp,
                color = MaterialTheme.colors.onBackground,
                shape = shape
            )
            .clip(shape)
            .width(60.dp)
            .height(60.dp)
    )
}
