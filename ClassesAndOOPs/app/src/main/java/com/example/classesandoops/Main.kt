package com.example.classesandoops

import Bike
import Car
import Girl

class Main
fun main(){
    val accountHolder = Account("shubham", 875569 , 832.5f)
    // val accountHolder = Account(800f)
    println(accountHolder.checkBalance())
    println(accountHolder.accHolderName)
    accountHolder.deposit(56f)
    println(accountHolder.checkBalance())
    accountHolder.withdraw(2000f)
    println(accountHolder.checkBalance())
    // getter setter practice
    val elizabeth = Girl()
    elizabeth.age = 35
    println(elizabeth.age)
    /*
     Topics Covered
     oops,constructor,inits,Visibility Modifier,override,properties(get set),nested-inner class
     */
    val car = Car(true,false)
    car.getInfo()
    println(car.Engine(4, 5).getEngineInfo())
    val bike = Bike(4,850)
    bike.maxSpeed = 0 // setter will be called
    println(bike.maxSpeed)  //getter will be called
    /*
    In Kotlin, late-initialized properties and variables are used when we need to initialize a property
    or variable at a later stage, rather than immediately when the object is created. This can be useful
    in situations where the initialization value is not known at the time of object creation
     */
    val example = LateInitProp()
    example.printMessage() // Message not initialized yet
    example.message = "Hello, world!"
    example.printMessage() // Hello, world!

    //used inner class in vehicles but just to clarify difference , small example which is created in
    //Account file and implementation is here
    val nestedClass = OuterClass.NestedClass()
    nestedClass.printName()

    val outerClass = OuterClass()
    val innerClass = outerClass.InnerClass()
    innerClass.printName()

}



