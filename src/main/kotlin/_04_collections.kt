//arrays are mutable lists
fun arrays(){
    val interestingThings = arrayOf("Kotlin", "Django", "Programming")
    val len =   interestingThings.size
    println(len)

    //accessing an item by the index
    println(interestingThings[0])

    //accessing an item by get
    println(interestingThings.get(0))

    for(item in interestingThings){
        println(item)
    }

    //add to a list
    interestingThings


}

//Lists are immutable
fun lists(){
    val items = listOf("Kotlin", "Django","Programming")
    val len =   items.size
    println(len)

    //accessing an item by the index
    println(items[0])

    //accessing an item by get
    println(items.get(0))

    for(item in items){
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

fun withMap(){
    val map = mapOf(1 to "baraka", 2 to 23, 3 to "trainer")
    map.forEach{ (key, value) -> print("$key - >  $value  ")
    }
   println("@2 " + map.getValue(2 ))
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