import kotlin.reflect.typeOf

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() {
    val num = listOf("one", "two", "three", "four")
    val longThan3 = num.filter {it.length > 3}
    println(longThan3)

    // declaring a 
    val numMap = mapOf("K1" to 1, "K2" to 2, "K3" to 3, "K4" to 4, "K101" to 101)
    val filteredMap = numMap.filter { it.key.endsWith("1") && it.value > 100}
    println(filteredMap)
}
