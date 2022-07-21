package com.example.mvi_test.data.model

import com.squareup.moshi.Json

data class User(
    @Json(name = "id")
    val id: Int = 0
)

