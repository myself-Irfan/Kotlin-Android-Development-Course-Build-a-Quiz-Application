/*
 List is an ordered collection of elements
 Can be mutable and immutable
 */


fun dataClass() {
    /*
    demonstrates data class
     */

    val usr1 = User("Name1")
    val usr2 = User("name2")
    val usr3 = User("nAme3")
    val usr4 = User("Name1")

    val names = mutableSetOf<User>(usr1, usr2, usr3, usr4)

    names.forEach { println(it.name) }
}


fun mutableList() {
    /*
    Can have duplicates
     */
    val names = mutableListOf("Name1", "Name2", "Name3")

    println("Before\t$names ")
//    names.forEach {println(it)}

    names.removeAt(1)
    names.remove("Name3")
    names.add("Name4")

    println("After\t$names ")
//    names.forEach {println(it)}
}


fun setOf() {
    /*
    Can not contain duplicates, nor can we make changes
     */
    val names = setOf("Name1", "Name2", "Name3")

    names.forEach {println(it)}

}

data class User(var name: String) {
    init {
        name = name.trim().lowercase()
    }
}