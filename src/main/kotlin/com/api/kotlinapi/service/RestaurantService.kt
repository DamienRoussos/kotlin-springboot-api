package com.api.kotlinapi.service

import org.springframework.stereotype.Service
import com.api.kotlinapi.datasource.RestaurantRepository
import com.api.kotlinapi.model.Restaurant

// Service class responsible for handling restaurant-related business logic
@Service
class RestaurantService(private val restaurantRepository: RestaurantRepository) {

    // Method to retrieve all restaurants
    fun getAllRestaurants(): Collection<Restaurant> = restaurantRepository.getAllRestaurants()

    // Method to retrieve a restaurant by ID
    fun getRestaurantById(id: String): Restaurant? = restaurantRepository.getRestaurantById(id)

    // Method to retrieve all active restaurants
    fun getAllActiveRestaurants(): Collection<Restaurant> {
        return restaurantRepository.getAllActiveRestaurants()
    }
}
