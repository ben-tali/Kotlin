//control flow

fun checkAge(age: Int) {
    //simple if statement
    if (age >= 45) {
        println("You are too old")
    } else if (age >= 18) {
        println("Allowed")
    } else {
        println("Seek parental Advice")
    }
}

//example two
fun usingIfTwo(a:Int, b:Int){
    var big: Int? = null
    //short form if
    if(a < b) big = b
    //with else
    big = if(a<b) b else  a

    println(big)
}

//if as an expression
fun ifAsAnExpression(a:Int, b:Int){
    val max = if(a>b) a else b
    println(max)
}

// use a when statement
fun usingWhen(x:Int){
    when (x){
        1 -> println("x == 1")
        2 -> {
            val y  = 90
            println("x==2")
        }
        else -> {
            //this is an else block
            println("X is neither 1 nor 2")
        }
    }
}

//using when example 2
fun checkAgeUsingWhen(age:Int){
    when (age) {
        in 1..17 -> println("Young to enter")
        in 18..45 -> println("Legal age")
        else -> println("none of the above")
    }
}


fun main() {
    checkAgeUsingWhen(10)
    checkAgeUsingWhen(18)
    checkAgeUsingWhen(48)
}