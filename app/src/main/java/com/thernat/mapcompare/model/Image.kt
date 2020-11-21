package com.thernat.mapcompare.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Image(
    @Json(name = "altText")
    val altText: String,
    @Json(name = "caption")
    val caption: String,
    @Json(name = "credit")
    val credit: String,
    @Json(name = "title")
    val title: String,
    @Json(name = "url")
    val url: String
)