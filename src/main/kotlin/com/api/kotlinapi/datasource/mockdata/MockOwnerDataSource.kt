package com.api.kotlinapi.datasource.mockdata

import com.api.kotlinapi.datasource.OwnerDataSource
import com.api.kotlinapi.model.Owner
import org.springframework.stereotype.Repository

// Mock implementation of OwnerDataSource
@Repository
class MockOwnerDataSource: OwnerDataSource {

    // Mock data for owners
    val owners = listOf(
        Owner(
            id = "1",
            name = "John Doe",
            taxNumber = "130498571345",
            contactNumber = "0612345678"
        )
    )

    // Method to retrieve all owners
    override fun retrieveAllOwners(): Collection<Owner> = owners

    // Method to retrieve an owner by ID
    override fun retrieveOwnerById(id: String): Owner = owners.firstOrNull { it.id == id}
        ?: throw NoSuchElementException("Could not find an owner with id $id")
}
