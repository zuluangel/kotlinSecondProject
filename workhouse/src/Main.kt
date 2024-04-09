//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException

fun ageCalculation() {
    val minAge = 18
    val maxAge = 120

    println("Welcome to the age validator program!")
    println("Please enter your birthdate (yyyy-mm-dd):")
    val birthDateString = readLine() ?: ""

    try {
        val birthDate = LocalDate.parse(birthDateString, DateTimeFormatter.ISO_DATE)
        val age = calculateAge(birthDate)

        if (age in minAge..maxAge) {
            println("Let's continue! You are $age years old.")
        } else if (age < 18){
            println("You are not too old enough to continue, you are just $age.")
        } else {
            println("Actually you must be a mommy now")
        }
    } catch (e: DateTimeParseException) {
        println("Invalid date format. Please enter your birthdate in yyyy-MM-dd format.")
    }
}

fun calculateAge(birthDate: LocalDate): Int {
    val currentDate = LocalDate.now()
    val years = currentDate.year - birthDate.year
    val currentDateAfterBirthDate = birthDate.plusYears(years.toLong())

    return if (currentDate.isBefore(currentDateAfterBirthDate)) years - 1 else years
}

fun main (){
    ageCalculation()
    /*credentials()
    signingIn()
    geometricFigures()*/
}
/*
fun credentials() {

    val credentials = mutableMapOf<String, String>()

    println("Welcome to the account creation program!")
    println("Please enter your desired username:")
    val username = readLine() ?: ""

    println("Please enter your desired password:")
    val password = readLine() ?: ""

    if (username.isNotBlank() && password.isNotBlank()) {
        credentials[username] = password
        println("Account successfully created!")
    } else {
        println("Invalid username or password. Please try again.")
        return
    }

    // You can optionally print the credentials here
    println("Your credentials have been stored securely.")
    println("Username: $username")
    println("Password: $password")
}
fun main(){
    credentials()
}


fun signingIn() {

    val credentials = mutableMapOf<String, String>()

    // Populate credentials map with some initial data
    credentials["user1"] = "password1"
    credentials["user2"] = "password2"
    credentials["user3"] = "password3"

    println("Welcome to the sign-in program!")
    println("Please enter your username:")
    val username = readLine() ?: ""

    println("Please enter your password:")
    val password = readLine() ?: ""

    if (authenticateUser(username, password, credentials)) {
        println("Login successful! Welcome, $username.")
    } else {
        println("Invalid username or password. Please try again.")
    }
}

fun authenticateUser(username: String, password: String, credentials: Map<String, String>): Boolean {
    return credentials.containsKey(username) && credentials[username] == password
}
fun main(){
    signingIn()
}


fun signingIn() {

    val credentials = mutableMapOf<String, String>()

    // Populate credentials map with some initial data
    credentials["user1"] = "password1"
    credentials["user2"] = "password2"
    credentials["user3"] = "password3"

    println("Welcome to the sign-in program!")
    println("Please enter your username:")
    val username = readLine() ?: ""

    println("Please enter your password:")
    val password = readLine() ?: ""

    if (authenticateUser(username, password, credentials)) {
        println("Login successful! Welcome, $username.")
    } else {
        println("Invalid username or password. Please try again.")
    }
}

fun authenticateUser(username: String, password: String, credentials: Map<String, String>): Boolean {
    return credentials.containsKey(username) && credentials[username] == password
}
fun main(){
    signingIn()
}*/
