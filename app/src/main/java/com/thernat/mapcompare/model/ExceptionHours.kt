package com.thernat.mapcompare.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ExceptionHours(
    @Json(name = "friday")
    val friday: String?,
    @Json(name = "monday")
    val monday: String?,
    @Json(name = "saturday")
    val saturday: String?,
    @Json(name = "sunday")
    val sunday: String?,
    @Json(name = "thursday")
    val thursday: String?,
    @Json(name = "tuesday")
    val tuesday: String?,
    @Json(name = "wednesday")
    val wednesday: String?
)