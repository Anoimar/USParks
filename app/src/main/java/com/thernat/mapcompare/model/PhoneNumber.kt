package com.thernat.mapcompare.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PhoneNumber(
    @Json(name = "description")
    val description: String,
    @Json(name = "extension")
    val extension: String,
    @Json(name = "phoneNumber")
    val phoneNumber: String,
    @Json(name = "type")
    val type: String
)