package com.example.classesandoops

data class Employee(var name: String, var salary: Int) {
    val id: Int = 85965
    // override fun toString(): String {
    // return "$id is employee id and name of Employee is $name"
    // }
    /*
    If there are explicit implementations of equals(), hashCode(), or toString() in the data class body
    or final implementations in a superclass, then these functions are not generated,
    and the existing implementations are used.
     */
}

/*
Inner classes have a hidden reference to an instance of the outer class, from which they were instantiated.
When an inner class is also a data class, this leads to a question, whether that
reference is one of the data class component properties?
And whether that reference affects how the functions equals, hashCode, toString,
componentN of the data class are generated depends on the answer on this question.
 */
