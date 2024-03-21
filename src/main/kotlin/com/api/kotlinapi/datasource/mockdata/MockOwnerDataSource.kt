package com.api.kotlinapi.datasource.mockdata

import com.api.kotlinapi.datasource.OwnerDataSource
import com.api.kotlinapi.model.Owner
import org.springframework.stereotype.Repository

@Repository
class MockOwnerDataSource: OwnerDataSource {

    val owners = listOf(
        Owner(
            id = 1,
            name = "John Doe",
            taxNumber = "130498571345",
            contactNumber = "0612345678"
        )

    )

    override fun retrieveAllOwners(): Collection<Owner> = owners

    override fun retrieveOwnerById(id: Long): Owner = owners.firstOrNull() { it.id == id}
        ?: throw NoSuchElementException("Could not find an owner with id $id")

}