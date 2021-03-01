package com.example.androiddevchallenge.ui.components.details

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.data.puppies

@Composable
fun Details(puppy: Puppy = puppies.first()) {
    Text(text = puppy.name)
}