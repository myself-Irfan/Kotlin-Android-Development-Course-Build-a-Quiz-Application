/*
Zip is used to combine two collections into a pair
 */

fun unzipDemo() {
    val numPair = listOf("red" to 1, "blue" to 2, "green" to 3, "yellow" to 4, "pink" to 5)
    println("Init: $numPair")
    println("Unzipped: ${numPair.unzip()}")
}


fun zipDemo() {
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