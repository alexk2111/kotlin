fun main() {
    val testNumb = 5
    testIf()
    testIf(testNumb)
    testWhen(testNumb)
    testNullability()
    testCollections()
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

fun testCollections() {
    //List
    val listReadOnly = listOf("one", "two", "three")
    println(listReadOnly)

    val listEdit = mutableListOf("one", "two", "three")
    listEdit.add("four")
    listEdit.remove("one")
    println(listEdit)

    val user = arrayOf("alex", "tom", "sara")
    println(java.util.Arrays.toString(user))

    val mix = arrayOf("train", 2)
    val numbers = intArrayOf(1,2,3)
    val numbers2 = intArrayOf(4,5,6)
    val foo = numbers2 + numbers
    println(java.util.Arrays.toString(foo))

    val numbers3 = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers3, oceans, "salmon")
    println(oddList)

    val array = Array (5)  { it + 10}
    println(java.util.Arrays.toString(array))

    val school = arrayOf("shark", "salmon", "minnow")
    for (element in school) {
        print("$element ")
    }
    for ((index, element) in school.withIndex()) {
        print("Item at $index is $element\n")
    }

    println("--------------")
    for (index in 0 until school.size) {
        print("Item at $index is ${school[index]}\n")
    }
    println("--------------")

    for(index in 0 until school.size step 2) {
        print("Item at $index is ${school[index]}\n")
    }
    println("--------------")
    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water\n")

    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water\n")

    repeat(2) {
        println("A fish is swimming")
    }

}