package com.example.classesandcollections

// Task 1
data class Event(
    val title: String,
    val description: String? = null,
    val dayPart: DayPart,
    val durationInMinutes: Int,
)

// Task 2
enum class DayPart {
    MORNING,
    AFTERNOON,
    EVENING,
}

fun main(){

}