package com.thernat.mapcompare.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Contacts(
    @Json(name = "emailAddresses")
    val emailAddresses: List<EmailAddresse>,
    @Json(name = "phoneNumbers")
    val phoneNumbers: List<PhoneNumber>
)