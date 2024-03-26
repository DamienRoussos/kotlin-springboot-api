package com.api.kotlinapi.controllers

import com.api.kotlinapi.model.Owner
import com.api.kotlinapi.service.OwnerService
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

// Controller responsible for handling Owner-related endpoints
@RestController
@RequestMapping("/owners")
class OwnerController(service: OwnerService) : BaseController<Owner, OwnerService>(service) {

    // Override method to retrieve all owners
    override fun getAllEntities(): Collection<Owner> = service.getAllOwners()

    // Override method to retrieve an owner by ID
    override fun getEntityById(id: String): Owner = service.getOwnerById(id)
}
