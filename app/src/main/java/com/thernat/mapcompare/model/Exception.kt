package com.thernat.mapcompare.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Exception(
    @Json(name = "endDate")
    val endDate: String,
    @Json(name = "exceptionHours")
    val exceptionHours: ExceptionHours,
    @Json(name = "name")
    val name: String,
    @Json(name = "startDate")
    val startDate: String
)