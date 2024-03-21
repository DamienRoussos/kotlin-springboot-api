package com.api.kotlinapi.controllers

import com.api.kotlinapi.model.Restaurant
import com.api.kotlinapi.service.RestaurantService
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@RestController
@RequestMapping("/restaurant")
class RestaurantController(private val service: RestaurantService) {

    @GetMapping
    fun getAllRestaurants(): Collection<Restaurant> = service.getAllRestaurants()

    @GetMapping("/{id}")
    fun getRestaurant(@PathVariable id: Long): Restaurant = service.getRestaurant(id)

    @GetMapping("/active")
    fun getAllActiveRestaurants(): Collection<Restaurant> = service.getAllActiveRestaurants()

}