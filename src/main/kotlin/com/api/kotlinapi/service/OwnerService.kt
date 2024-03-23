package com.api.kotlinapi.service

import org.springframework.stereotype.Service
import com.api.kotlinapi.datasource.OwnerRepository
import com.api.kotlinapi.model.Owner

// Service class responsible for handling owner-related business logic
@Service
class OwnerService(private val ownerRepository: OwnerRepository) {

    // Method to retrieve all owners
    fun getAllOwners(): Collection<Owner> = ownerRepository.getAllOwners()

    // Method to retrieve an owner by ID
    fun getOwnerById(id: String): Owner = ownerRepository.getOwnerById(id)
}
