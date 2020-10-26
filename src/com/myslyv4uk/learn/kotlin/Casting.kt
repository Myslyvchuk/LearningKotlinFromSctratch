package com.myslyv4uk.learn.kotlin

fun main() {
    val longVal :Any = 5L
    val castLongVal: Long = longVal as Long
    println("Long cast ${castLongVal::class.qualifiedName}")
}