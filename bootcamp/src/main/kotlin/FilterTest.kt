fun main() {
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    // eager, creates a new list
    val eager = decorations.filter { it [0] == 'p' }
    println("eager: $eager")
    println("--------------------")

    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")
    val newList = filtered.toList()
    println("new list: $newList")

    println("--------------------")
//    val lazyMap = decorations.asSequence().map {
//        println("access: $it")
//        it
//    }
//    println("lazy: $lazyMap")
//    println("-----")
//    println("first: ${lazyMap.first()}")
//    println("-----")
//    println("all: ${lazyMap.toList()}")

    val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
        println("access: $it")
        it
    }
    println("-----")
    println("filtered: ${lazyMap2.toList()}")


}