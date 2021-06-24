
//control flow
fun checkAge(age:Int){
    if(age >= 45){
        println("Too OLD")
    }else if(age  >= 18){
        println("Allowed")
    }else {
        println("Seek parental advice")
    }
}

const val a= 10
const val b= 49
var big: Int = a

//simple if example 2
fun usingIf(){
    if (a < b) big = b
   // With else
    if (a > b) {
        big = a
    } else {
        big = b
    }
    println(big)
}

// As expression
fun ifAsAnExpression(a:Int, b:Int){
    val max = if (a > b) a else b
}

//using the when statement
fun usingWhen(x:Int){
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> { // Note the block
            println("x is neither 1 nor 2")
        }
    }
}

fun usingWhenTwo(x:Int){
    when (x) {
        in 1..10 -> println("x is in the range")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }
}


fun main() {
    checkAge(27)
    checkAge(8)
    checkAge(67)
    usingIf()
    usingWhen(1)
    usingWhenTwo(9)
}