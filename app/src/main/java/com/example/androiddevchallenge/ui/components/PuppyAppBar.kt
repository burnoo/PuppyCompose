package com.example.androiddevchallenge.ui.components

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.KEY_ROUTE
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.androiddevchallenge.R

@Composable
fun PuppyAppBar(navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.arguments?.getString(KEY_ROUTE)
    val shouldShowBack = currentRoute != null && currentRoute != "home"
    TopAppBar(
        title = { Text(text = stringResource(id = R.string.app_name)) },
        navigationIcon = if (shouldShowBack) { { BackIcon(navController) } } else null
    )
}

@Composable
fun BackIcon(navController: NavHostController) {
    IconButton(onClick = {
        navController.popBackStack()
    }) {
        Icon(Icons.Default.ArrowBack, contentDescription = "back")
    }
}