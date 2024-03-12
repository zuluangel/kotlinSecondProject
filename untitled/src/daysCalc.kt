import java.time.LocalDate
import java.time.temporal.ChronoUnit

fun daysPassedSinceDate(year: Int, month: Int, day: Int): Triple<Int, Int, Int> {
    val currentDate = LocalDate.now()
    val startDate = LocalDate.of(year, month, day)
    val daysPassed = ChronoUnit.DAYS.between(startDate, currentDate).toInt()
    val monthPassed = ChronoUnit.MONTHS.between(startDate, currentDate).toInt()
    val yearsPassed = ChronoUnit.YEARS.between(startDate, currentDate).toInt()
    return Triple (daysPassed, monthPassed, yearsPassed)
}

fun main() {

    println("Please enter the year you were born")
    val year = readln().toInt()
    println("Please enter the month you were born")
    val month = readln().toInt()
    println("Please enter the day you were born")
    val day = readln().toInt()

    val (daysPassed, monthPassed, yearsPassed) = daysPassedSinceDate(year, month, day)
    println("Number of days passed since $day/$month/$year: $daysPassed days")
    println("Number of months passed since $day/$month/$year: $monthPassed months")
    println("Number of years passed since $day/$month/$year: $yearsPassed years")
    println(monthPassed.toDouble()/12)


   if (yearsPassed < 18) {
        println("You are less than 18 years old, so you do not have access to the info contained in this page")
    } else {
        println("Please sign up!")
    }
}

