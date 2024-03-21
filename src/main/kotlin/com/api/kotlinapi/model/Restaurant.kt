package com.api.kotlinapi.model

data class Restaurant (
    val id: Long,
    val name: String,
    val address: String,
    val active: Boolean,
    val zipcode: String,
    val location: Location,
    val contactNumber: String,
    val email: String,
    val websiteUrl: String?,
    val socialMediaProfiles: Map<String, String>?,
    val operatingHours: Map<String, Collection<String>>, // Day to opening hours
    val menu: List<MenuItem>,
    val ratings: List<Rating>,
    val cuisineType: List<String>,
    val paymentOptions: List<String>,
    val owners: List<Owner>?,
    val ultimateBeneficialOwner: Owner
)

data class MenuItem (
    val name: String,
    val description: String?,
    val dietaryInformation: List<String>?,
    val price: Double
)

data class Rating (
    val rating: Double,
    val review: String?
)

data class Location(
    val latitude: Double,
    val longitude: Double,
    val neighborhood: String?,
    val city: String,
    val country: String
)