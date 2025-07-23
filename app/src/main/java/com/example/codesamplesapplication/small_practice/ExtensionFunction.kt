package com.example.codesamplesapplication.small_practice

fun main() {
    val myString = "Hello there World Laxmikant!"
    println(myString.reverse())
}

fun String.reverse():String {
    var list = this.split(" ")
    var result = list.reversed().joinToString(" ")
    return result
}

