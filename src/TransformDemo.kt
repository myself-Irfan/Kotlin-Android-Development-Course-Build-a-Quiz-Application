fun partitionDemo() {
    /*
    Demonstrates partition methods
     */
    val num = (1..10).toList()
    // returns a pair of list from list, first list defined by logic and second list the rest
    val (even, odd) = num.partition {it%2==0}
    println(even)
    println(odd)
}


fun filterDemo() {
    /*
    Demonstrates filter methods
     */
    val num = listOf("one", "two", "three", "four")
    val longThan3 = num.filter {it.length > 3} // filter by value length
    println(longThan3)

    // declaring a map of keys and values
    val numMap = mapOf("K1" to 1, "K2" to 2, "K3" to 3, "K4" to 4, "K101" to 101)
    // filtering by key/value and assigning to a val
    val filteredMap = numMap.filter { it.key.endsWith("1") && it.value > 100}
    println(filteredMap)
    // filtering by index or index and value
    val filteredIndex = num.filterIndexed {index, value -> (index != 0) && (value.length < 5)}
    println(filteredIndex)
    val filteredNot = num.filterNot { it.length <= 3 } // opposite of logic will be returned similar to not
    println(filteredNot)

    val mixdLi = listOf(1, 2, "One", "two", '1', "2", 'A', false)
    // filter col by dtype
    mixdLi.filterIsInstance<Char>().forEach {
        println("Instance filtered: $it")
    }
}


fun unzipDemo() {
    val numPair = listOf("red" to 1, "blue" to 2, "green" to 3, "yellow" to 4, "pink" to 5)
    println("Init: $numPair")
    println("Unzipped: ${numPair.unzip()}")
}


fun zipDemo() {
    /*
    Zip is used to combine two collections into a pair
    */
    val col = listOf("red", "brown", "grey")
    val animals = listOf("fox", "bear", "wolf")

    // zip syntax
    println(col.zip(animals))
//    println(col zip animals)

    // returning a zipped string defined in the body
    val colStatement = col.zip(animals) { col, animal ->
        "The ${animal.replaceFirstChar { it.uppercase() }} is $col"
    }
    println(colStatement)
//    colStatement.forEach { println(it) }
}


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