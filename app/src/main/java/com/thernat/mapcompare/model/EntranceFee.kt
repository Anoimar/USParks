package com.thernat.mapcompare.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EntranceFee(
    @Json(name = "cost")
    val cost: String,
    @Json(name = "description")
    val description: String,
    @Json(name = "title")
    val title: String
)