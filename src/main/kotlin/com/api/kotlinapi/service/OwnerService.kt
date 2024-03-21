package com.api.kotlinapi.service

import org.springframework.stereotype.Service
import com.api.kotlinapi.datasource.OwnerDataSource
import com.api.kotlinapi.model.Owner

@Service
class OwnerService(private val dataSource: OwnerDataSource) {
    fun getAllOwners(): Collection<Owner> = dataSource.retrieveAllOwners()

    fun getOwner(id: Long): Owner = dataSource.retrieveOwnerById(id)
}