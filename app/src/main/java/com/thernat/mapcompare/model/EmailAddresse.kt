package com.thernat.mapcompare.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EmailAddresse(
    @Json(name = "description")
    val description: String,
    @Json(name = "emailAddress")
    val emailAddress: String
)