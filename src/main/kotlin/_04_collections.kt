//collections in kotlin
//arrays are mutable lists
fun arrays(){
    // declaration array
    val interestingThings  = arrayOf("Kotlin", "Django", "Android")

    //checking the length(size) of an array
    val len  = interestingThings.size
    println(len)

    //accessing an item by the index
    println(interestingThings[1])

    //iterate over a list
    for (item in interestingThings){
        println(item)
    }
}

//lists are immutable
fun lists() {
    //declaration of a list
    val items = listOf<String>("Kotlin", "Django", "programming")

    //checking the length(size) of an array
    val len  = items.size
    println(len)

    //accessing an item by the index
    println(items[1])

    //iterate over a list
    for (item in items){
        println(item)
    }

}


//more functional approach to collections iteration
//lambda
fun collections(){
    val interestingThings = arrayOf("Kotlin", "Django", "Programming")
    interestingThings.forEach { item->
        println(item)
    }
    //include index
    interestingThings.forEachIndexed {
        index, item ->
        println("$index = $item")
    }

}


//maps
fun maps() {
    //declaration of a map
    val map = mapOf(1 to "baraka", 2 to "sam", 3 to "Mohammed")

    //get the len(size)
    val len = map.size
    println(len)

    //get an element
    println(map.getValue(2))

    //use for each to iterate on a map
    map.forEach {
            (key, value) -> println("$key ->  $value")
    }
}

//collections are immutable by default
//for mutable collections use mutable
fun mutableList(){
    val modules = mutableListOf("PHP", "Kotlin", "Java")
    modules.add("Python")
    println(modules)
}

//modify sayHello to greet multiple people
fun sayHelloThere( message:String,people:List<String>){
    people.forEach{person->
        println("$message  $person")
    }
}

//functions with varying arguments
fun greeting(msg:String, vararg people:String){
    people.forEach{person->
        println("$msg  $person")
    }
}


fun main() {
    val people = listOf<String>("Jackson", "Mary", "Jane")
    arrays()
    mutableList()
//    sayHelloThere("Hello There", people)
//    greeting("Hello ", "Mary", "Wanja", "John")
}