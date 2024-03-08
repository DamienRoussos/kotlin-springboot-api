package com.api.kotlinapi.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestHeader

data class Username(val user:String)

@RestController
class Controller {
    @GetMapping("/")
    fun getHello(): String {
        return "Hello World!"
    }

    @GetMapping("/login")
    fun getCredentials(@RequestHeader("username") username: String,
                       @RequestHeader("password") password: String): String {
        return "User with username $username and $password is signed in"
    }

    @PostMapping("/hello")
    fun postHello(@RequestBody request:Username): String {
        return "Hello ${request.user}"
    }
}