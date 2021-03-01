package com.example.androiddevchallenge.ui.components

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

@Composable
fun PuppyScaffold() {
    val navController = rememberNavController()

    Scaffold(
        topBar = { PuppyAppBar(navController) },
    ) {
        Surface(color = MaterialTheme.colors.background) {
            PuppyNavigator(navController)
        }
    }
}