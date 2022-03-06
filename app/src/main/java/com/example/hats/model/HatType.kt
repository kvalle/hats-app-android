package com.example.hats.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class HatType(
    @StringRes val name: Int,
    @StringRes val description: Int,
    @StringRes val attribution: Int,
    @DrawableRes val image: Int
)