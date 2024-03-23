package com.api.kotlinapi.datasource.mockdata

import com.api.kotlinapi.datasource.RestaurantDataSource
import com.api.kotlinapi.model.*
import org.springframework.stereotype.Repository

// Mock implementation of RestaurantDataSource
@Repository
class MockRestaurantDataSource: RestaurantDataSource {

    // Mock data for restaurants
    val restaurants = listOf(
        Restaurant(
            id = "1",
            name = "McDonald's",
            address = "Somewhere 1234",
            active = true,
            zipcode = "2308AJ",
            location = Location(45.5061551,-73.5559958,"","Amsterdam","NL"),
            contactNumber = "0203894567",
            email = "info@mcdonaldsexample.com",
            websiteUrl = "https://www.themcdonalds.com",
            socialMediaProfiles = emptyMap(),
            operatingHours = mapOf(
                "Monday" to listOf("12:00","23:30"),
                "Tuesday" to listOf("12:00","23:30"),
                "Wednesday" to listOf("12:00","23:30"),
                "Thursday" to listOf("12:00","23:30"),
                "Friday" to listOf("12:00","23:30"),
                "Saturday" to listOf("11:00","23:30"),
                "Sunday" to listOf("11:00","23:30")
            ),
            menu = listOf(MenuItem(
                "big-mac-menu",
                "burger-menu",
                emptyList(),
                8.50
            ), MenuItem(
                "cheese-burger-menu",
                "burger-menu",
                emptyList(),
                8.40
            )
            ),
            ratings = listOf(Rating(
                3.7,
                ""
            ), Rating(
                2.6,
                "terrible service"
            )),
            cuisineType = listOf("American","Burger"),
            paymentOptions = listOf("online","cash"),
            owners = emptyList(),
            ultimateBeneficialOwner = Owner(
                "14",
                "John Doe",
                "1324709817345",
                "0623453451"
            )
        )
    )

    // Method to retrieve all restaurants
    override fun retrieveAllRestaurants(): Collection<Restaurant> = restaurants

    // Method to retrieve a restaurant by ID
    override fun retrieveRestaurant(id: String): Restaurant = restaurants.firstOrNull { it.id == id }
        ?: throw NoSuchElementException("Could not find a restaurant with id $id")

    // Method to retrieve all active restaurants
    override fun retrieveAllActiveRestaurants(): Collection<Restaurant> {
        val activeRestaurants = restaurants.filter { it.active }
        return activeRestaurants.ifEmpty {
            throw NoSuchElementException("Could not find active restaurants")
        }
    }
}
