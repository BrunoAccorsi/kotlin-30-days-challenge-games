package com.example.a30daysgames.model

import androidx.annotation.DrawableRes

data class DayChallenge (
    val dayNumber: Int,
    val title: String,
    val description: String,
    @DrawableRes val imageResId: Int = 0 // Default to 0 which can be checked as invalid resource ID
)