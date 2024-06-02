package com.example.coding_made_easy.model

data class Question(
    val id: Int,
    val questionText: String,
    val options: List<String>,
    val correctAnswer: Int
)

