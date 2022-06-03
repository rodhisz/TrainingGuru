package com.rsz.trainingguru

fun main() {
    val range = 1..100
    val range2 = 1..100 step 2

    println(range.count())
    println(range.first)
    println(range.last)
    println(range.step)
    println(range.contains(50))

    println(range2.count())
    println(range2.first)
    println(range2.last)
    println(range2.step)
    println(range2.contains(50))

    val rangeDown = 100 downTo 1
    rangeDown.forEach {
        println(it)
    }

}