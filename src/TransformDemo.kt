fun windowDemo() {
    val num = listOf("one", "two", "second", "three", "four", "five", "six", "third")
    // it makes a window of specified size for each element until reaches the end
    println(num.windowed(3))
}


fun chunkDemo() {
    val num = (0..13).toList()
    println(num.chunked(3)) // chunks list to a nested list with 3 elements per list
    println(num.chunked(3) {it.sum()}) // returns a list of chunking by 3 element and summing them
}


fun dropTakeLast() {
    /*
    Demonstrates take, drop and last for both
     */
    val num = listOf("one", "two", "three", "four", "five", "six")

    println(num.take(3)) // take the first 3 elements
    println(num.takeLast(3)) // take the last 3 elements
    println(num.drop(5)) // drop till 5 elements from start
    println(num.dropLast(5)) // drop till 5 elements from end

    println(num.takeWhile { !it.startsWith("f") }) // takes while element does not start with f
    println(num.takeLastWhile { it != "three" }) // from last takes element until element is three
    println(num.dropWhile { it.length == 3 }) // drops until element length is not 3
    println(num.dropLastWhile { it.contains("i") }) // from last drops if element has i
}

fun listSlice() {
    /*
    Demonstrates slices
     */
    val num = listOf("one", "two", "three", "four", "five", "six", "seven")

    println(num.slice(1..3)) // slicing by index
    println(num.slice(0..4 step 2)) // index slicing but 2 increment
    println(num.slice(setOf(3, 5, 0))) // index slicing with set
}


fun groupDemo() {
    /*
    Demonstrates groupBy
     */
    val num = listOf("one", "two", "three", "four", "five")
    //groupsby the uppercased first character of the elements
    println(num.groupBy { it.first().uppercase() })
    //groupsby the first char of element and uppercases the elements
    println(num.groupBy(keySelector = {it.first()}, valueTransform = {it.uppercase()}))
}


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