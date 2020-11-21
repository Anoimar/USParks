package com.thernat.mapcompare.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Addresse(
    @Json(name = "city")
    val city: String,
    @Json(name = "line1")
    val line1: String,
    @Json(name = "line2")
    val line2: String,
    @Json(name = "line3")
    val line3: String,
    @Json(name = "postalCode")
    val postalCode: String,
    @Json(name = "stateCode")
    val stateCode: String,
    @Json(name = "type")
    val type: String
)