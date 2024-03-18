package com.api.kotlinapi.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.api.kotlinapi.controllers"])
class KotlinApiApplication

fun main(args: Array<String>) {
	runApplication<KotlinApiApplication>(*args)
}