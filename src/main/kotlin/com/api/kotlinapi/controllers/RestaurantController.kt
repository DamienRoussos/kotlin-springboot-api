package com.api.kotlinapi.controllers

import com.api.kotlinapi.model.Restaurant
import com.api.kotlinapi.service.RestaurantService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

// Controller responsible for handling Restaurant-related endpoints
@RestController
@RequestMapping("/restaurant")
class RestaurantController(service: RestaurantService) : BaseController<Restaurant, RestaurantService>(service) {

    // Endpoint to retrieve all active restaurants
    @GetMapping("/active")
    fun getAllActive(): Collection<Restaurant> = service.getAllActiveRestaurants()

    // Override method to retrieve all restaurants
    override fun getAllEntities(): Collection<Restaurant> = service.getAllRestaurants()

    // Override method to retrieve a restaurant by ID
    override fun getEntityById(id: String): Restaurant = service.getRestaurantById(id)!!
}
