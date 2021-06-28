
//use the fun keyword to define a new function

fun getGreeting(): String? {
    return  "Hello World"
}

//if you have a function that does not return anything
//useful omit the return  [void, Unit]

//short form --single expression function
fun fetchGreeting():String = "Hello Kotlin"

//remove explicit return type
fun findGreeting() = "Hello Kotlin"

//kotlin allows us to write less code to achieve more

//function with parameters
//fun  sayHello(name:String){
//    //val msg = "Hello " + name
//    println("Hello  $name")
//}

//single expression
fun sayHello(name:String, msg:String)= println("$name says $msg")


//explicit function assignment
fun greetPerson(greeting:String, name:String) =
    println("$greeting $name")

//default parameter
fun greetMe(message:String ="Hello", name:String) =
    println("$message $name")


//free-function (top level functions)
fun main() {
    println(getGreeting())
    println(findGreeting())
    sayHello("Baraka", "Hello There")
    sayHello("James", "Yoh Wassup??? ")
    greetMe(name="Baraka")
}