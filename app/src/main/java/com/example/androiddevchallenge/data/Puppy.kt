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
package com.example.androiddevchallenge.data

import android.os.Parcelable
import androidx.annotation.DrawableRes
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Sex.F
import com.example.androiddevchallenge.data.Sex.M
import kotlinx.parcelize.Parcelize
import java.util.Locale

enum class Sex {
    M, F;

    fun text() = when (this) {
        M -> "he"
        F -> "she"
    }
}

private fun createDescription(puppy: Puppy) = with(puppy) {
    (
        "This is $name. ${sex.text().capitalize(Locale.ENGLISH)} is $ageMonths months old " +
            "and ${sex.text()} is a good ${if (sex == M) "boi" else "girl"}. " +
            "Really wants to meet you. \uD83E\uDD7A"
        )
        .trim()
}

@Parcelize
data class Puppy(
    val name: String,
    val ageMonths: Int,
    val sex: Sex,
    @DrawableRes val imageRes: Int,
) : Parcelable {
    val description: String
        get() = createDescription(this)
}

val puppies = listOf(
    Puppy(name = "Bruno", sex = M, ageMonths = 7, imageRes = R.drawable.puppy_1),
    Puppy(name = "Luna", sex = F, ageMonths = 3, imageRes = R.drawable.puppy_2),
    Puppy(name = "Gafa", sex = F, ageMonths = 5, imageRes = R.drawable.puppy_3),
    Puppy(name = "Reksio", sex = M, ageMonths = 4, imageRes = R.drawable.puppy_4),
    Puppy(name = "Azor", sex = M, ageMonths = 9, imageRes = R.drawable.puppy_5),
    Puppy(name = "Anek", sex = M, ageMonths = 11, imageRes = R.drawable.puppy_6),
    Puppy(name = "Waldo", sex = M, ageMonths = 3, imageRes = R.drawable.puppy_7),
    Puppy(name = "Kasek", sex = M, ageMonths = 6, imageRes = R.drawable.puppy_9),
    Puppy(name = "Barka", sex = F, ageMonths = 6, imageRes = R.drawable.puppy_8),
    Puppy(name = "Kiti", sex = F, ageMonths = 12, imageRes = R.drawable.puppy_10),
)
