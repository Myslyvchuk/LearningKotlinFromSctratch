package com.myslyv4uk.learn.kotlin

data class Customer(
        val name: String,
        val address: String,
        var age: Int) {

    constructor(name: String, age: Int) : this(name, "Ukraine", age) {
        println("secondary constructor")
    }

    init {
        println("init block for primary constructor")
    }
}

class AlternativeCustomer(val name: String, var age: Int) {
    var address: String

    init {
        address = ""
    }

    constructor(name: String, address: String, age: Int) : this(name, age) {
        this.address = address;
    }
}

class AnotherAlternativeCustomer(val name: String, var age: Int, val address: String = "Ukraine") {
    var approved: Boolean = false
        set(value) {
            if (age >= 24) {
                field = value
            } else
                println("You can't approve a customer under 19 year old")
        }
    val nextAge
        get() = age + 1

    fun toUpperCae(): String = name.toUpperCase()

    override fun toString(): String =
            "$name $address $age"

    companion object {
        fun getInstance() = AnotherAlternativeCustomer("Ricki", 22, "Danfoss")
    }

    operator fun component1() = name
    operator fun component2() = age
}

fun main() {
    val customer = AnotherAlternativeCustomer("Bohdan", 29, "Lviv")
    customer.age = 30
    customer.approved = true
    val customer2 = AnotherAlternativeCustomer("Sasha", 23)
    println("${customer.name} is ${customer.age} years old and is ${customer.approved}")
    println("${customer2.toUpperCae()} is ${customer2.age} years old and is ${customer2.approved}")

    val customer3 = AnotherAlternativeCustomer.getInstance()
    println(customer3)

    val customer4 = Customer("Sally", 23)
    println(customer4)
    val customer5 = customer4.copy(name = "Diane")
    println(customer5)

    val (name, address, age) = customer5
    println(name)

    //operator from AnotherAlternativeCustomer
    val (name2, age2) = customer
    println(name2)

}