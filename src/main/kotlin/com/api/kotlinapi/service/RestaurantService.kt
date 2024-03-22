package com.api.kotlinapi.service

import org.springframework.stereotype.Service
import com.api.kotlinapi.datasource.RestaurantDataSource
import com.api.kotlinapi.model.Restaurant

// Service class responsible for handling restaurant-related business logic
@Service
class RestaurantService(private val dataSource: RestaurantDataSource) {

    // Method to retrieve all restaurants
    fun getAllRestaurants(): Collection<Restaurant> = dataSource.retrieveAllRestaurants()

    // Method to retrieve a restaurant by ID
    fun getRestaurantById(id: String): Restaurant = dataSource.retrieveRestaurant(id)

    // Method to retrieve all active restaurants
    fun getAllActiveRestaurants(): Collection<Restaurant> = dataSource.retrieveAllActiveRestaurants()
}
