fun main() {
    val testNumb = 5
    testIf()
    testIf(testNumb)
    testWhen(testNumb)
    testNullability()
}

fun testIf(testVar: Int = 50) {
    if (testVar in 1.. 40) {
        println("Good ratio!")
    } else {
        println("Unhealthy ratio")
    }
}

fun testWhen(testVar: Int) {
    when(testVar){
        0 -> println("Empty")
        in 1..39 -> println("Got!")
        else -> println("That's a lot")
    }
}

fun testNullability() {
    var firstVarargs: Int? = null
    firstVarargs = firstVarargs?.dec() ?: 0
    println(firstVarargs)

    var seckondVar = 5
    seckondVar = seckondVar?.dec() ?: 0
    println(seckondVar)
}