fun increaseDirty(start: Int) = start + 1

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty + 10)
}

fun main() {
    var dirtyLevel = 20
    val waterFilter = { dirty: Int -> dirty / 2 }
    val waterFilter1: (Int, Int) -> Int = { dirty, alpha -> (dirty + alpha) / 2 }
    println(waterFilter(dirtyLevel))
    println(waterFilter1(dirtyLevel, dirtyLevel))

    dirtyLevel = 19
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel2 -> dirtyLevel2 + 23 }
    println(dirtyLevel)

    println(updateDirty(15, ::increaseDirty))
}

