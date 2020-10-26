package com.myslyv4uk.learn.kotlin

import java.io.FileInputStream
import java.lang.Exception

fun divide(a: Int, b: Int): Double {
    // All exceptions are unchecked
    Thread.sleep(100)
    return (a.toDouble() / b)
}

fun printFile() {
    val input = FileInputStream("file.txt")
    input.use {
        // autoclosable
    }
}

fun main() {
    var result = try {
        divide(5, 23)
    } catch (e: Exception) {
        println(e)
        0
    }

    println(result)
}