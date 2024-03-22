package com.api.kotlinapi.datasource

import com.api.kotlinapi.model.Owner

// Interface defining operations for accessing owner data
interface OwnerDataSource {
    fun retrieveAllOwners(): Collection<Owner>
    fun retrieveOwnerById(id: String): Owner
}
