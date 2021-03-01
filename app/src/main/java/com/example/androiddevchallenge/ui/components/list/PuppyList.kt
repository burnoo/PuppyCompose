package com.example.androiddevchallenge.ui.components.list

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.data.puppies

@Preview
@Composable
fun PuppyList(navController: NavHostController? = null, list: List<Puppy> = puppies) {
    LazyColumn {
        items(list) { puppy ->
            ListItem(navController, puppy)
        }
    }
}