package com.example.androiddevchallenge.ui.components

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.ui.components.details.Details
import com.example.androiddevchallenge.ui.components.list.PuppyList

@Composable
fun PuppyNavigator() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "home") {
        composable("home") { PuppyList(navController) }
        composable(route = "details") {
            val puppy = navController.previousBackStackEntry
                ?.arguments
                ?.getParcelable<Puppy>("puppy")!!
            Details(puppy)
        }
    }
}