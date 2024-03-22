package com.api.kotlinapi.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

abstract class BaseController<Type, Service>(val service: Service) {

    @GetMapping
    fun getAll(): Collection<Type> = getAllEntities()

    @GetMapping("/{id}")
    fun Entity(@PathVariable id: String): Type = getEntityById(id)

    abstract fun getAllEntities(): Collection<Type>

    abstract fun getEntityById(id: String): Type
}