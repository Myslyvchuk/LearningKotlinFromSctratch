package com.myslyv4uk.learn.kotlin

import java.math.BigDecimal

fun main() {

    val bd: BigDecimal = BigDecimal(10)
    val bd2: Long // not Integer
    println("Hello $bd")

    bd2 = 5

    var name = "Bohdan"
    val surname: String = "Myslyvchuk"

    name = "Bogdan"
    println("Hello $name ${surname.toUpperCase()}")
    println("Your name has ${name.length} characters")

    val multiLineString = """
        Multi 
        |line 
        String""".trimMargin("|")
    println(multiLineString)

    val myDouble = 21.0

    println("Is my Double a Double? ${myDouble is Double}")
    println("myDouble' is ${myDouble::class.qualifiedName}")
    println("myDouble's javaClass is ${myDouble.javaClass}")
}