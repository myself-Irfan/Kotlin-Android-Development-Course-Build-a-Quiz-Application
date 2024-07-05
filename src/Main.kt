import kotlin.reflect.typeOf

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() {
    val num = listOf("one", "two", "three", "four")
    val longThan3 = num.filter {it.length > 3}
    println(longThan3)

    // declaring a map of keys and values
    val numMap = mapOf("K1" to 1, "K2" to 2, "K3" to 3, "K4" to 4, "K101" to 101)
    // filtering by value and assigning to a val
    val filteredMap = numMap.filter { it.key.endsWith("1") && it.value > 100}
    println(filteredMap)
    // filtering by index or index and value
    val filteredIndex = num.filterIndexed {index, value -> (index != 0) && (value.length < 5)}
    println(filteredIndex)
}
