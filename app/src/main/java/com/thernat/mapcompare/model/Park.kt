package com.thernat.mapcompare.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Park(
    @Json(name = "activities")
    val activities: List<Activity>,
    @Json(name = "addresses")
    val addresses: List<Addresse>,
    @Json(name = "contacts")
    val contacts: Contacts,
    @Json(name = "description")
    val description: String,
    @Json(name = "designation")
    val designation: String,
    @Json(name = "directionsInfo")
    val directionsInfo: String,
    @Json(name = "directionsUrl")
    val directionsUrl: String,
    @Json(name = "entranceFees")
    val entranceFees: List<EntranceFee>,
    @Json(name = "entrancePasses")
    val entrancePasses: List<EntrancePasse>,
    @Json(name = "fees")
    val fees: List<Any>,
    @Json(name = "fullName")
    val fullName: String,
    @Json(name = "id")
    val id: String,
    @Json(name = "images")
    val images: List<Image>,
    @Json(name = "latLong")
    val latLong: String,
    @Json(name = "latitude")
    val latitude: String,
    @Json(name = "longitude")
    val longitude: String,
    @Json(name = "name")
    val name: String,
    @Json(name = "operatingHours")
    val operatingHours: List<OperatingHour>,
    @Json(name = "parkCode")
    val parkCode: String,
    @Json(name = "states")
    val states: String,
    @Json(name = "topics")
    val topics: List<Topic>,
    @Json(name = "url")
    val url: String,
    @Json(name = "weatherInfo")
    val weatherInfo: String
)