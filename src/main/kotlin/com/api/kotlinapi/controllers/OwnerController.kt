package com.api.kotlinapi.controllers

import com.api.kotlinapi.model.Owner
import com.api.kotlinapi.service.OwnerService
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@RestController
@RequestMapping("/owner")
class OwnerController(private val service: OwnerService) {

    @GetMapping
    fun getAllRestaurants(): Collection<Owner> = service.getAllOwners()

    @GetMapping("/{id}")
    fun getRestaurant(@PathVariable id: Long): Owner = service.getOwner(id)

}