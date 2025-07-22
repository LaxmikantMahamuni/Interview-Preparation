package com.example.codesamplesapplication.kotlin_practice

fun addition(a: Int, b: Int): Int {
    return a + b
}

fun returnMeAddFunction(): (Int, Int) -> Int {
    return ::add
}

fun main() {
    val operation = returnMeAddFunction()
    val result = operation(10, 20)
    println(result)
}
