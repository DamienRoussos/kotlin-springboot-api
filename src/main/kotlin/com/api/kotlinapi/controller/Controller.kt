package com.api.kotlinapi.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

data class Username(val user:String)

@RestController
class Controller {
    @GetMapping("/")
    fun getHello(): String {
        return "Hello World!"
    }

    @PostMapping("/hello")
    fun postHello(@RequestBody request:Username): String {
        return "Hello ${request.user}"
    }
}