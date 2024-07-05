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