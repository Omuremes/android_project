package com.example.mycity.data

data class Review(
    val authorName: String,
    val text: String,
    val rating: Int 
)

data class Place(
    val id: Int,
    val categoryId: Int,
    val name: String,
    val description: String,
    val address: String,
    val phone: String = "+996 55X XXX XXX",
    val website: String = "www.example.com",
    val schedule: String = "Ежедневно с 10:00 до 24:00",
    val latitude: Double = 0.0,
    val longitude: Double = 0.0,
    val ratingAvg: Double = 4.7,
    val ratingCount: Int = 1738,
    val imagesRes: List<Int>,
    val reviews: List<Review> = emptyList()
)
