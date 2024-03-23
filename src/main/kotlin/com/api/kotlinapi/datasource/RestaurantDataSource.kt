package com.api.kotlinapi.datasource

import com.api.kotlinapi.model.Restaurant
import org.springframework.data.jpa.repository.JpaRepository

// Interface defining operations for accessing restaurant data
interface RestaurantRepository: JpaRepository<Restaurant, String> {
    fun getAllRestaurants(): Collection<Restaurant>
    fun getRestaurantById(id: String): Restaurant
    fun getAllActiveRestaurants(): Collection<Restaurant>
}
