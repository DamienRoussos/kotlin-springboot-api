package com.api.kotlinapi.model
import jakarta.persistence.*

// Data class representing an owner
@Entity
@Table(name = "owner")
data class Owner (
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    val id: String,
    val name: String,
    val taxNumber: String,
    val contactNumber: String,
    @OneToMany(mappedBy = "owner")
    val restaurants: List<Restaurant>?
)
