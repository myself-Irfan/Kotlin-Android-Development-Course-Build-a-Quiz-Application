fun lambdaDemo () {
    //    println("Add result: ${add(2,3)}")
    // beforeArrow constructor after body only printing
    val mylambdafun = { a: Int, b: Int -> println("My lambda\t$a + $b = ${a + b}") }
//    mylambdafun(3, 4)

    // (input dtype) -> return dtype
    val mylambdafun2: (Int, Int) -> Int =
        // constructor
        { a: Int, b: Int ->
            // body
            val result = a + b
            println("Will return $result")
            // return result
            result
        }
//    mylambdafun2(5, 4)

    // assigning a lambda fun
    val myL2 = {a: Int -> println("Printing from myL2: $a")}
    add2(6,9, myL2)

    // lambda defined inside a fun constructor
    add2(9,4, { a: Int -> println("Printing from constructorLambda: $a") })

    // lambda moved out of parenthesis
    add2(3, 8) { a: Int -> println("Printing outside args but is treated as constructorLambda: $a") }
}

// action is a lambda parameter which takes an Int and returns Unit(void)
fun add2(a: Int, b: Int , action: (Int) -> Unit) {
    action(a+b)
}


fun add(a: Int, b: Int): Int {
    /*
    normal func
     */
    return a + b
}