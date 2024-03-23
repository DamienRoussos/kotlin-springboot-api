package com.api.kotlinapi.service

import org.springframework.stereotype.Service
import com.api.kotlinapi.datasource.mockdata.MockOwnerDataSource
import com.api.kotlinapi.model.Owner

// Service class responsible for handling owner-related business logic
@Service
class OwnerService(private val dataSource: MockOwnerDataSource) {

    // Method to retrieve all owners
    fun getAllOwners(): Collection<Owner> = dataSource.retrieveAllOwners()

    // Method to retrieve an owner by ID
    fun getOwnerById(id: String): Owner = dataSource.retrieveOwnerById(id)
}
