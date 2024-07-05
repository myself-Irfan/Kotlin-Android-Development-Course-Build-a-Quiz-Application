/*
Transform elements in a collection
 */

fun mapOp () {
    // assigning a set of unique int
    val nums = setOf(1, 2, 3, 4, 5)
    nums.forEach { println(it) }

    // simply returns a new List instead of changing the og val
    val m1 = nums.map { it * 10 }
    m1.forEach{println(it)}
    // mapIndexedNotNull iterates over each element with index and exclude null
    // null is set by the logic in the body
    println(m1.mapIndexedNotNull{ index, value -> if (index == 0) null else index + value })

    nums.map { if (it%2==0) println("$it is Even") else println("$it is Odd")}
    // declaring a map of keys and val
    val numMap = mapOf("k1" to 1, "k2" to 2, "k3" to 3, "k4" to 4)
    // assigning numMap to m2 with uppercase keys
    var m2 = numMap.mapKeys { it.key.uppercase() }
    // assigning m2 to m2 with updated values
    m2 = m2.mapValues { it.value + it.key.length }
    m2.forEach{ println("${it.key} ${it.value}") }
}

fun mutableMap() {
    val users = mutableMapOf<Int, String>(0 to "Irfan", 1 to "Amaterasu", 2 to "Asif", 3 to "Susanoo")

    users.remove(2)
    println("Size -> ${users.size}")
    // if [2] already has val it will replace else it will append to endofmap
    users[2] = "Vlad"

    users.forEach { t, u ->
        println("$t -> $u")
    }
}


fun mapIns() {
    val users = mapOf<Int, String>(1 to "Maria", 2 to "Alex", 3 to "Asif")

    println(users[2])
}