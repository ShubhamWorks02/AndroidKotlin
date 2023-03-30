package com.example.firstone

import kotlin.reflect.typeOf

class FirstKtClass{

//    fun main(){
//        println(countOfEvenNumbers)
//    }
    
}

fun main() {

    val countOfEvenNumbers: Float = 10_00.5f
    val another:Float = 45.6f

    //countOfEvenNumbers = 4
    val number = arrayOf(4,5,6)
    val chararray = charArrayOf('d','d')
    val arr = Array(8,{i->i*2})

    println(countOfEvenNumbers + another )

    for (num in number){
        println(num)
    }

    println("""hello |i am $another""")

    val firstWord = "Learn "
    val secondWord = "Kotlin"
    val bothWords = "$firstWord $secondWord"

    println("$bothWords has ${bothWords.length}")
    println(""""$bothWords" has ${bothWords.length}""")//Raw Strings ”””

    println(arr)

    var forCondition = 6

    val getOutput = if (forCondition == 4){
         forCondition
    }else if (forCondition == 5){
        forCondition++
    }else
    {
        "helo"
    }
    println(getOutput)

    val value1 = 6
    val value2 = 3
    val operator = "/"
    val resultOfOperation = when (operator) {
        "+" -> value1 + value1
        "-" -> value1 - value2
        "*" -> value1 * value2
        "/" -> value1 / value2
        else -> "$operator operator is invalid."
    }

    println(resultOfOperation)

    var age = 66
    when (age) {
        in 1..66 -> print("Age is in the range")
        !in 66..110 -> print("Age is outside the range")
        else -> print("None of the above")

    }

    var persons = arrayOf("shubham", "darshan","shyam")
    for (item in persons)
        println(item)

}