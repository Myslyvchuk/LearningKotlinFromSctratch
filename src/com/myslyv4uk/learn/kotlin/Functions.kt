package com.myslyv4uk.learn.kotlin

fun main() {
    printAsString("Hell Bohdan")
    println(addTwoNumbers(two = 4.5, one = 6.13))
    println(addTwoNumbers(one = 6.13))
}

// public static by default
fun printAsString(value: String, stringWithDefault: String = "DefaultValue") {
    // value is val
    println("$value $stringWithDefault")
}

fun addTwoNumbers(one: Double, two: Double = 0.0): Double = one + two


fun methodTakesLambda(input: String, action: (String) -> Int ){
    println(action(input))
}