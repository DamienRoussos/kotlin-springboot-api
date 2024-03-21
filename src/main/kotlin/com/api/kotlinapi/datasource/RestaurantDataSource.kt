package com.api.kotlinapi.datasource

import com.api.kotlinapi.model.Restaurant

interface RestaurantDataSource {
    fun retrieveAllRestaurants(): Collection<Restaurant>
    fun retrieveRestaurant(id: Long): Restaurant
    fun retrieveAllActiveRestaurants(): Collection<Restaurant>
}