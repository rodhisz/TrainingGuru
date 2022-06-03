package com.rsz.trainingguru

fun main() {
    var counter = 0

    //lambda
    val increment : () -> Unit = {
        println(counter)
        counter++
    }
    increment()
    increment()
    increment()
    println(counter)

    println("---------------------")
}

//Closure buat interaksi dengan data sekitar dengan scope yang sama

