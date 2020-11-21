package com.thernat.mapcompare.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Activity(
    @Json(name = "id")
    val id: String,
    @Json(name = "name")
    val name: String
)