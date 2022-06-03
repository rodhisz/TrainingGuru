package com.rsz.trainingguru

fun main() {

    var penjumlahan = 10 + 10
    val pengurangan = 100 - 70
    val pembagian = 100 / 10
    val perkalian = 100 * 10
    val modulus = 100 % 10

    println("Hasil sisa bagi : $modulus")

    //augment assigment
    penjumlahan += 10
    //penjumlahan = penjumlahan + 10
    println(penjumlahan)

    penjumlahan *= 10
    println(penjumlahan)

    penjumlahan++
    println(penjumlahan)
}