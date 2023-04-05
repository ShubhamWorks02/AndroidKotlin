package com.example.classesandoops

data class Shubham(
    val isLazy: Boolean = true,
    val isDeveloper: Boolean? = null,
    val vehicle: Vehicle = Vehicle()
)

data class Vehicle(val gears: Int = 9)

fun main() {
    val shubham: Shubham? = Shubham()
    println(shubham?.vehicle?.gears)
}