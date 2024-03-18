package com.api.kotlinapi.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping

data class Restaurant(
    val id: Long,
    val name: String,
    val address: String,
    val active: Boolean
)

@RestController
@RequestMapping("/restaurant")
class RestaurantController {
    @GetMapping("")
    fun getAll(): Iterable<Restaurant> = listOf(
        Restaurant(1, "McDonald's", "Somewhere 1234", true),
        Restaurant(2, "Burger King", "Somewhere 2345", true),
        Restaurant(3, "Domino's", "Somewhere further", false)
    )
}

//    @GetMapping("/login")
//    fun getCredentials(@RequestHeader("username") username: String,
//                       @RequestHeader("password") password: String): String {
//        return "User with username $username and $password is signed in"
//    }
//
//    @PostMapping("/hello")
//    fun postHello(@RequestBody request:Username): String {
//        return "Hello ${request.user}"
//    }
//}