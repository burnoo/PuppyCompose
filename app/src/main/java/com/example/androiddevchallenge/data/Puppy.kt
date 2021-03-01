package com.example.androiddevchallenge.data

import androidx.annotation.DrawableRes
import com.example.androiddevchallenge.R

data class Puppy(
    val name: String,
    val ageMonths: Int,
    @DrawableRes val imageRes: Int,
)

val puppies = listOf(
    Puppy(name = "Bruno", ageMonths = 7, imageRes = R.drawable.puppy),
    Puppy(name = "Luna", ageMonths = 3, imageRes = R.drawable.puppy),
    Puppy(name = "Gafa", ageMonths = 5, imageRes = R.drawable.puppy),
    Puppy(name = "Reksio", ageMonths = 4, imageRes = R.drawable.puppy),
    Puppy(name = "Azor", ageMonths = 9, imageRes = R.drawable.puppy),
    Puppy(name = "Anek", ageMonths = 11, imageRes = R.drawable.puppy),
    Puppy(name = "Waldo", ageMonths = 3, imageRes = R.drawable.puppy),
    Puppy(name = "Kasek", ageMonths = 6, imageRes = R.drawable.puppy),
    Puppy(name = "Barka", ageMonths = 6, imageRes = R.drawable.puppy),
    Puppy(name = "Kiti", ageMonths = 12, imageRes = R.drawable.puppy),
    Puppy(name = "Darka", ageMonths = 4, imageRes = R.drawable.puppy),
    Puppy(name = "Metik", ageMonths = 7, imageRes = R.drawable.puppy),
    Puppy(name = "Walos", ageMonths = 2, imageRes = R.drawable.puppy),
)