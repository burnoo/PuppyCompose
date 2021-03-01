package com.example.androiddevchallenge.ui.components.list

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
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
    val (name, ageMonths) = puppy

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
            .clickable {
                navController?.currentBackStackEntry
                    ?.arguments
                    ?.putParcelable("puppy", puppy)
                navController?.navigate("details")
            }
    ) {
        ListImage(puppy)
        Text(text = "$name ($ageMonths months)", style = MaterialTheme.typography.h5)
    }
}

@Preview(backgroundColor = 0xFFFFFF, showBackground = true)
@Composable
fun ListImage(puppy: Puppy = puppies.first()) {
    val (name, _, imageRes) = puppy

    val shape = RoundedCornerShape(8.dp)

    Image(
        painter = painterResource(id = imageRes),
        contentDescription = "Puppy $name",
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