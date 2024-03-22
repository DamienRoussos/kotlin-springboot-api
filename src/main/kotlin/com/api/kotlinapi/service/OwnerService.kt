package com.api.kotlinapi.service

import org.springframework.stereotype.Service
import com.api.kotlinapi.datasource.OwnerDataSource
import com.api.kotlinapi.model.Owner

// Service class responsible for handling owner-related business logic
@Service
class OwnerService(private val dataSource: OwnerDataSource) {

    // Method to retrieve all owners
    fun getAllOwners(): Collection<Owner> = dataSource.retrieveAllOwners()

    // Method to retrieve an owner by ID
    fun getOwnerById(id: String): Owner = dataSource.retrieveOwnerById(id)
}
