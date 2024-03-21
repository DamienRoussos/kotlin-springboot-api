package com.api.kotlinapi.datasource

import com.api.kotlinapi.model.Owner

interface OwnerDataSource {
    fun retrieveAllOwners(): Collection<Owner>
    fun retrieveOwnerById(id: Long): Owner
}