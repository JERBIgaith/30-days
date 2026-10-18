package com.example.thirtydays.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Tip(
    val day: Int,
    @StringRes val title: Int,
    @StringRes val description: Int,
    @DrawableRes val image: Int
)
