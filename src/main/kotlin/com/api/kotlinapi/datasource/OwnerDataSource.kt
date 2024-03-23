package com.api.kotlinapi.datasource

import com.api.kotlinapi.model.Owner
import org.springframework.data.jpa.repository.JpaRepository

// Interface defining operations for accessing owner data
interface OwnerRepository: JpaRepository<Owner, Long> {
    fun getAllOwners(): Collection<Owner>
    fun getOwnerById(id: String): Owner
}
