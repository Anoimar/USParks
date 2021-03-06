package com.thernat.mapcompare.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OperatingHour(
    @Json(name = "description")
    val description: String,
    @Json(name = "exceptions")
    val exceptions: List<Exception>,
    @Json(name = "name")
    val name: String,
    @Json(name = "standardHours")
    val standardHours: StandardHours
)