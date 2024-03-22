package com.api.kotlinapi.datasource

import com.api.kotlinapi.model.Restaurant

// Interface defining operations for accessing restaurant data
interface RestaurantDataSource {
    fun retrieveAllRestaurants(): Collection<Restaurant>
    fun retrieveRestaurant(id: String): Restaurant
    fun retrieveAllActiveRestaurants(): Collection<Restaurant>
}
