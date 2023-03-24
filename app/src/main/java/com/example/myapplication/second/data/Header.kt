package com.example.myapplication.second.data

data class Header(
    val id: Int,
    val title: String,
    val items: kotlin.collections.List<HeaderImage>
)

data class HeaderImage(
    val photo: Int
)


