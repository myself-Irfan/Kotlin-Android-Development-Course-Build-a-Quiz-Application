fun flattenDemo() {
    // declaring a list of sets
    val numSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(7, 8 ,9))

//    for (num in numSets) {
//        for (n in num)
//            println(n)
//        println()
//    }

    // returns a list of 2D arr to 1
    val numSetFlat = numSets.flatten()
    println(numSetFlat)
}


fun associateDemo() {
    /*
    demonstrates associate usage
     */
    val num = listOf<String>("one", "two", "three", "four")
    // associateWith uses the og val as keys and the logic as val
    println(num.associateWith { it.length })
    // associateBy uses the logic as keys, if duplicate then latest remains
    println(num.associateBy ({ it.first().uppercase() }))
    // associate key with val 1st index, value as value length
    println(num.associateBy(keySelector = {it.first().uppercase()}, valueTransform = {it.length}))
    // associating index as keys
    println(num.associateBy( { num.indexOf(it) }, {it} ))
}


fun strRepresentation() {
    val numStr = listOf("one", "two", "three", "four")
    println(numStr)
    println(numStr.joinToString()) // join list to a String separated by a space and ,
    println(numStr.joinToString { "Element: ${it.uppercase()}" }) // Transforming og values with defined and joining to String

    // declaring a string buffer and storing to a val
    val liStr = StringBuffer("The list of numbers: ")
    // join the list to a string and appends it to the string in param
    println(numStr.joinTo(liStr))
    // joins list to a String with separator, prefix and postfix
    println(numStr.joinToString(separator = " | ", prefix = "start: ", postfix = " : end."))

    // assigning a list converted from int range
    val nums = (1..35).toList()
    println(nums)
    // joining only 15 elements and replace rest with specified in truncated
    println(nums.joinToString(limit= 15, truncated = "<..>"))

}