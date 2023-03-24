package com.example.myapplication.origin

sealed class Data {
    data class Title(
        val id: Int,
        val text: String,
        val price: String
    ): Data()

    data class Image(
        val id: Int,
        val resource: Int
    ): Data()

    data class Content(
        val id: Int,
        val text: String
    ): Data()

    data class Option(
        val id: Int,
        val icon: Int,
        val text: String
    ): Data()
}

