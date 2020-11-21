package com.thernat.mapcompare.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ParkResponse(
    @Json(name = "data")
    val park: List<Park>,
    @Json(name = "limit")
    val limit: String,
    @Json(name = "start")
    val start: String,
    @Json(name = "total")
    val total: String
)