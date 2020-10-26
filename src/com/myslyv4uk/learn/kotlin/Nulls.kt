package com.myslyv4uk.learn.kotlin

fun main() {
    val nullStr: String?

    nullStr = "me"

    println(nullStr.toUpperCase())

    var name: String? = null

    println(name?.toUpperCase())


    var address = null

    var integ: Int? = 7
    integ = null
}