import java.lang.NumberFormatException

fun main (){
    println("Please enter the year you were born")
    val yearEntry = readln()
   /* println("Please enter the month you were born")
    val month = readln().toInt()
    println("Please enter the day you were born")
    val day = readln().toInt()*/


    try {
        if (yearEntry != null) {
            val year = yearEntry.toInt()
            if (year < 1900) {
                println("You must be dead")
            } else {
                println("Keep going")
            }
        } else {
            println("You didn't enter a year.")
        }
    } catch (e: NumberFormatException) {
        println("Wrong type of data: $yearEntry is not a valid number")
    }
}

