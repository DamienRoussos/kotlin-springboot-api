package com.api.kotlinapi.service

import org.springframework.stereotype.Service
import com.api.kotlinapi.datasource.RestaurantDataSource
import com.api.kotlinapi.model.Restaurant

@Service
class RestaurantService(private val dataSource: RestaurantDataSource) {
    fun getAllRestaurants(): Collection<Restaurant> = dataSource.retrieveAllRestaurants()

    fun getRestaurant(id: Long): Restaurant = dataSource.retrieveRestaurant(id)

    fun getAllActiveRestaurants(): Collection<Restaurant> = dataSource.retrieveAllActiveRestaurants()

}