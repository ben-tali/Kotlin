package io.baraka

//primary constructor
class Person(val firstName: String, val lastName: String) {
    init {
        println("Init 1")
    }

    //secondary constructor
    constructor() : this("John", "Doe") {
        println("Secondary constructor")
    }

    init {
        println("Init 2")
    }

}

/*
 a secondary constructor is not necessary
 because of the power of default parameters
 class  Worker(val name:String ="Jack", val position:String ="Cook")
 */

