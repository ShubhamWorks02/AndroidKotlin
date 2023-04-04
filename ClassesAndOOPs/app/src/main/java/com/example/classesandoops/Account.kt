package com.example.classesandoops

import java.util.Arrays

class Account (var accHolderName: String, private val accountNumber: Int, private var balance: Float) {
    // val accHolderName: String = accHolderName
    // private val accountNumber: Int = accountNumber
    // private var balance: Float = balance

    init {
        println("initializing account of $accHolderName having $balance in his/her account")
    }
    constructor(balance: Float) : this( "shyam", 975647, 0f) {
        println("balance will be updated")
        this.balance += balance
    }
    fun deposit(amount: Float) {
        balance += amount
    }
    fun withdraw(amount: Float) {
        if (amount < balance) {
            balance -= amount
        } else {
            println("insufficient balance")
        }
    }
    fun checkBalance(): Float {
        return balance
    }
    //we can just print it too for checking balance

}
//To pass the default value place '=' and give value in primary constructor parameter in class header

open class LateInitProp {
    lateinit var message: String
    fun printMessage() {
        if (::message.isInitialized) {
            println(message)
        } else {
            println("Message not initialized yet")
        }
    }
}

class OuterClass {
    public val outerName: String = "Outer Class"

    class NestedClass {
        fun printName() {
            println("This is a Nested Class ")
        }
    }

    inner class InnerClass {
        fun printName() {
            println("This is an Inner Class")
            println("Outer Class Name: $outerName")
        }
    }
}









