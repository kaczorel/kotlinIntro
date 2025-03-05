package org.example

fun main() {
    println("Hello World!")

    task0()
    task1()
}


typealias lambda = (Boolean, Char) -> Int

fun task0() {
    val mylambda: lambda = { a: Boolean, b: Char ->
        println("Hello lambda!")
        2 + 2
    }
    val mylambdaa: lambda = abc@{ a: Boolean, b: Char ->
        println("Hello lambda!")
        return@abc 2 + 2
    }

    val lambda2: (() -> Unit) -> Unit = {

    }
    lambda2({ println("lambda2!") })
    lambda2() { println("lambda2!") }
    lambda2 {
        println("lambda2!")
    }


    val res = mylambda(true, 'b') //.invoke()
    println(res)

    //List<T>
    //Map<K, V>
    //Set<T>

    //MutableList<T>
    //MutableMap<K, V>
    //MutableSet<T>

    val list: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    list.add(123)
    list.set(0, 7)

    val newList = list.filter { it > 10 }.toMutableList()

    var firstNotNull = list
        .filterNotNull()
        .firstOrNull { it % 2 == 0 }

    val myMap = mutableMapOf<String, Int>(
        Pair("a", 4),
        "abc" to 1
    )
    myMap["asd"] = 1
    println(myMap["asd"])

    myMap.forEach { (key, value) -> println("$key: $value") }
    myMap.forEach { p -> println("${p.key}: ${p.value}") }
    println("%s %d".format("as2121d", 22))
}

fun task1(){
    val intval: Int = 123
    val stringval: String = 12.toString()
    val doubleval: Double = 1.toDouble()
    val charval: Char = 1.toChar()
    val longval:Long = 123
}

fun checkPermissions(perms: Int){

}