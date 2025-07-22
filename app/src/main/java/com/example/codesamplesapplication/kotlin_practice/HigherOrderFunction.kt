package com.example.codesamplesapplication.kotlin_practice

fun add(a: Int, b: Int): Int {
    return a + b
}

fun myHigherOrderFun(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun main() {
    val result = myHigherOrderFun(10, 20, ::add)
    println(result)
}