package com.example.androiddevchallenge.ui.components.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.data.puppies

@Preview
@Composable
fun Details(puppy: Puppy = puppies.first()) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp)
    ) {
        Image(
            painter = painterResource(id = puppy.imageRes),
            contentDescription = "Puppy ${puppy.name}",
            modifier = Modifier.fillMaxWidth()
                .padding(start = 24.dp, end = 24.dp)
                .aspectRatio(1f)
                .clip(shape = MaterialTheme.shapes.medium)
        )
        Text(
            text = puppy.name,
            style = MaterialTheme.typography.h4,
            modifier = Modifier.padding(top = 24.dp)
        )
        Text(
            text = puppy.description,
            style = MaterialTheme.typography.body1,
            modifier = Modifier.padding(top = 12.dp)
        )
    }
}