package com.example.myapplication.main.data

import android.graphics.drawable.Drawable
import com.example.myapplication.R

data class Feature(
    val id : Int? = 0,
    var icon : Int? = R.drawable.baseline_check_circle_24,
    val text : String? = ""
)
