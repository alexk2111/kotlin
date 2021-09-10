fun increaseDirty(start: Int) = start + 1

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}


fun main() {
    var dirtyLevel = 20
    val waterFilter = { dirty: Int -> dirty / 2 }
    val waterFilter1: (Int, Int) -> Int = { dirty, alpha -> (dirty + alpha) / 2 }
    println(waterFilter(dirtyLevel))
    println(waterFilter1(dirtyLevel, dirtyLevel))

    println(updateDirty(15, ::increaseDirty))

    dirtyLevel = 19
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel2 ->
        var result = dirtyLevel2 + 23
        result *= 2
        result
    }
    println(dirtyLevel)
}

