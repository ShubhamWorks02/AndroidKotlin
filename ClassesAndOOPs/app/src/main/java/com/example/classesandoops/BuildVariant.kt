package com.example.classesandoops

enum class BuildVariant (val status: String) {
    beta("still in beta phase"),
    release("to be released"),
    debug("debugging phase")
}
enum class DAYS(val isWeekend: Boolean = false) {
    SUNDAY(true){
        public fun weekend(){
            println("Today includes weekendType")
        }
    },
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY(true)

    // Default value overridden
}

fun variantCheck(buildVariant: BuildVariant) {
    when (buildVariant) {
        BuildVariant.beta -> {
            // Code to handle beta build variant
            println("beta variant selected")
        }
        BuildVariant.release -> {
            // Code to handle release build variant
            println("release variant selected")
        }
        BuildVariant.debug -> {
            // Code to handle debug build variant
            println("debug variant selected")
        }
    }
}