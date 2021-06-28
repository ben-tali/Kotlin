//variables

//mutable variables
var mutable: Int = 5463

//immutable
val name: String = "Baraka"

//name = "Jack"
//variables are non null in kotlin
//kotlin can dynamically figure out what data type a variable is

var greeting: String? = null;

fun main() {
    val wholeNumber = 3
    val bigNumber = 3L
    val preciseDecimal = 3.33
    val decimal = 3.33f
    val isNew = false
    val firstInitial = 'A'
    val firstName = "Baraka"

    println(
        "My first name is $firstName, and sum is " +
                "" +
                "" +
                "${bigNumber + wholeNumber}"
    )
}
