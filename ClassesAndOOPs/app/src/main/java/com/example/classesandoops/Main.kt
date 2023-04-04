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
    bike.maxSpeed = 100 // setter will be called
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

    // 4/4
    // using interfaces
    bike.start()
    // println(bike.toString()) // cant have Readable result bcz it is not data class

    //enum
    val build = BuildVariant.release
    println(build.status)
    val day = DAYS.SUNDAY
    println(BuildVariant.valueOf("beta"))
    variantCheck(build)
    for (day in DAYS.values()) {
        println("${day.ordinal} = ${day.name}")
    }
    println("${DAYS.valueOf("WEDNESDAY")}")

    //Employee implementation
    val shyam = Employee( "shyam", 100)
    val (name,salary) = shyam // destructuring
    println(name)
    // Destructuring works on local variable only
    // compiles down to val name = shyam.component1() , val salary = shyam.component2()
    // The componentN() functions need to be marked with the operator keyword to allow using them
    // in a destructuring declaration.
    val shubham = shyam.copy(salary = 5)
    println(shyam.component1())
    val hashOfShubham = shubham.hashCode()
    val hashOfShyam = shyam.hashCode()
    println(hashOfShubham)
    println(hashOfShyam)
    println(hashOfShyam.equals(hashOfShubham))
    shubham.name = "Shubham"
    println(shyam.toString()) // it will only print primary constructor parameter
    println(shubham.toString())
    shubham.salary = 90
    println(shyam.toString())
    println(shubham.toString())
    val darshan = shyam.copy()
    darshan.salary = 800
    println(darshan.toString())
    println(shyam.toString())

    //Aircraft class implementation
    val chopper = AirCraft.Helicopter()
    chopper.fly()
    println(chopper.type)
    val airBus = Aeroplane()
    val waterCraft = Aeroplane.HoverCraft()
    waterCraft.fly()
    checkType(chopper)
}



