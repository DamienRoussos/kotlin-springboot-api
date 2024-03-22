package com.api.kotlinapi.model

// Data class representing a restaurant
data class Restaurant (
    val id: String,
    val name: String,
    val address: String,
    val active: Boolean,
    val zipcode: String,
    val latitude: Double,
    val longitude: Double,
    val neighborhood: String?,
    val city: String,
    val country: String,
    val contactNumber: String,
    val email: String,
    val websiteUrl: String?,
    val socialMediaProfiles: Map<String, String>?,
    val operatingHours: Map<String, Collection<String>>, // Day to opening hours
    val menu: List<MenuItem>,
    val ratings: List<Rating>?,
    val cuisineType: List<String>,
    val paymentOptions: List<String>
//    val owners: List<Owner>?,
//    val ultimateBeneficialOwner: Owner
)

// Data class representing a menu item
data class MenuItem (
    val name: String,
    val description: String?,
    val dietaryInformation: List<String>?,
    val price: Double
)

// Data class representing a rating
data class Rating (
    val rating: Double,
    val review: String?
)
