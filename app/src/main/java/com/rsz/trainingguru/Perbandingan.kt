package com.rsz.trainingguru

fun main() {
    val angka1 = 20
    val angka2 = 91
    val angka3 = 215
    val angka4 = 100

    println(angka1 > angka2)
    println(angka1 < angka2)
    println(angka1 >= angka2)
    println(angka1 <= angka2)
    println(angka1 == angka2)
    println(angka1 != angka2)

    //oprasi boolean

    //&& dan
    //|| or
    //! negasi

    if (angka1 % 2 == 0) {
        println("$angka1 adalah bilangan genap")
    } else {
        println("$angka1 adalah bilangan ganjil")
    }

    if (angka2 % 2 == 0) {
        println("$angka2 adalah bilangan genap")
    } else {
        println("$angka2 adalah bilangan ganjil")
    }

    if (angka3 % 2 == 0) {
        println("$angka3 adalah bilangan genap")
    } else {
        println("$angka3 adalah bilangan ganjil")
    }

    if (angka4 % 2 == 0) {
        println("$angka4 adalah bilangan genap")
    } else {
        println("$angka4 adalah bilangan ganjil")
    }


}