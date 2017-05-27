package ktpkg

import java.io.*
import kotlin.io.*

/**
 * Created by Bill on 2017/5/23.
 */
fun main(args: Array<String>) {
//    println("Hello Kotlin")
//
//    val str = "Hello\tWorld!\n"
//    println(str)

//    val test = """for (c in "foo") {print(c)}"""
//    println(test)

//    val test = """
//        |Tell me and I forget.
//        |Teach me and I remember.
//        |Involve me and I learn.
//        |(Benjamin Franklin)
//        """.trimMargin()
//    println(test)

//    val price = """
//    ${'$'}9.99
//    """.trim()
//
//    val p = 9.9
//    val p2 = """$$p"""
//
//    println(price)

//    val a = 5
//    val b = 3
//    val max = if (a > b) a else b

//    var x = 5
//    while (x > 0) {
//        println(x)
//        x--
//    }

//    var y = 5
//    do {
//        y--
//        println(y)
//    } while (y != 0)

//    loop@ for (i in 1..3) {
//        for (j in 1..5) {
//            if (i == 2 && j == 3)
//                continue@loop
//            println("$i:$j")
//        }
//    }

    var s = foo()
    println("s:"+s)

}

fun foo() {
    val ints = listOf("apple", "banana", "kiwi")
   /* ints.forEach {
        if (it.equals("banana")) return@forEach
        println(it)
    }*/
    ints.forEach(fun(value:  String){
        if (value.equals("banana")) return
        println(value)
    })
}