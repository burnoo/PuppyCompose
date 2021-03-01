package com.example.androiddevchallenge.ui.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.ui.components.details.Details
import com.example.androiddevchallenge.ui.components.list.PuppyList

@Composable
fun PuppyNavigator(navController: NavHostController) {
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