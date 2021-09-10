import java.util.*

fun feedTheFish() {
    val day = randomDay()
    val food = "pellets"
    println ("Today is $day and the fish eat $food")
}

fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun isToWarnTemperature(temperature: Int = 10) = temperature > 50


fun main() {
    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 100
    val message = "The water temperature is ${ if (isToWarnTemperature(temperature)) "too warm" else "OK" }."
    println(message)

    feedTheFish()
}
