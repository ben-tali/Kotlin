package io.baraka

class Student(
    val firstName: String = "John",
    val lastName: String = "Doe",
) {
    //mutable string
    var nickName: String? = null
        set(value) {
            field = value
            println("The new nickname is $nickName")
        }
        get() {
            println("The nickName is $field")
            return field;
        }

    fun printInfo() {
        println(
            "Hello there I am $firstName {${nickName ?: "No Nickname"}} $lastName" +
                    "" +
                    "  but most of the folks call me ${if (nickName != null) nickName else "No NickName"} "
        )
    }


}