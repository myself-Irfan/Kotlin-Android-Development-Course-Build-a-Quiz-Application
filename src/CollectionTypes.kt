/*
Demonstrates different collection types
 */
fun liToMap() {
    val numLi:List<Int> = (1..10).toList()

    val numMap = numLi.withIndex().associateBy(keySelector = {it.index}, valueTransform = {it.value})
    println(numMap)

    val numMap2 = numLi.withIndex().associate{it.index to it.value}
    println(numMap2)
}


fun mapOp() {
    val nums = setOf(1, 2, 3, 4, 5)
    println("Set: $nums")
    nums.map {if (it%2 == 0) println("$it is Even") else println("$it is Odd")}

    // returns a new List instead of changing the og val
    val numsMap = nums.map {it * 10}
    println("numsMap: $numsMap")
    // mapIndexedNotNull iterates over each element with index and exclude null
    // null is set by the logic in the body
    println(numsMap.mapIndexedNotNull{ index, value -> if (index == 0) null else index + value})

    // declaring a map with keys and values
    val numsMap2 = mapOf("k1" to 1, "k2" to 2, "k3" to 3)
    // assigning numsMap2 to a val with uppercase keys
    var m1 = numsMap2.mapKeys { it.key.uppercase() }
    m1 = m1.mapValues { it.key.length + it.value }
    println(m1)
}


fun mapType() {
    // immutable map
    val map1 = mapOf(1 to "Maria", 2 to "Alex", 3 to "Asif")
    println(map1)

    // mutable map
    val map2 = mutableMapOf(0 to "Irfan", 1 to "Amaterasu", 2 to "Asif", 3 to "Susanoo")
    map2.remove(2) // remove using key
    map2[2] = "Vlad"
    map2.forEach{index, value -> println("Index: $index\tValue: $value")}
}


fun listType() {
    // immutable list
    val lst1 = listOf("Name1", "Name2", "Name3")
    println(lst1)

    // mutable list
    val lst2 = mutableListOf("Name1", "Name2", "Name3")
    println("Before $lst2")
    lst2.removeAt(1) // remove using index
    lst2.remove("Name3") // remove using element
    lst2.add("Name4") // append element
    println("After $lst2")
}

fun setType() {
    // Can not contain duplicates, nor can we make changes
    val set1 = setOf(1, 2, 3, 4, 5)
    println(set1)

    val set2 = setOf("Name1", "Name2", "Name3")
    println(set2)
}


fun dataClassDemo() {
    val usr1 = User("Name1")
    val usr2 = User(" name2")
    val usr3 = User("NaMe1")

    val nameSet = setOf(usr1, usr2, usr3)
    nameSet.forEach{ println(it.name) }

    val dUsr1 = DUser("Name1")
    val dUsr2 = DUser(" name2")
    val dUsr3 = DUser("NaMe1")

    val nameSet2 = setOf(dUsr1, dUsr2, dUsr3)
    nameSet2.forEach{ println(it.name) }
}


data class DUser(var name: String) {
    init {
        name = name.trim().lowercase()
    }
}


class User(var name: String) {
    init {
        name = name.trim().lowercase()
    }
}