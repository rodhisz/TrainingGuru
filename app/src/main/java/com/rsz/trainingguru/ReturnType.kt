package com.rsz.trainingguru

fun main() {
    val luas = luasSegitiga(10,7)
    println(luas)
}

//ini function punya kembalian

fun luasSegitiga(alas: Int, tinggi: Int): Int {
    return alas * tinggi / 2
}

fun luasSegitiga2(alas: Double, tinggi: Double): Double {
    return alas * tinggi * 0.5
}

fun luasSegitiga3(alas: Int, tinggi: Int): Int {
    return (alas * tinggi * 0.5).toInt()
}

//single expression function
fun luasSegitiga4(alas: Int, tinggi: Int): Int = (alas * tinggi * 0.5).toInt()

/*function ada 2
* 1. function punya kembalian
* 2. function tidak punya kembalian*/
