package com.rsz.trainingguru

fun main() {
    val name = "humam"
    val result = name.hello()
    println(result)

    val sisi1 = 50
    val sisi2 = 50
    val luas = sisi1 * sisi2
    val result2 = luas.cetakLuas()
    println(result2)

    val luas2 = sisi1 * sisi2
    luas2.cetakLuas2()
}

fun String.hello() {
    println("Hello $this")
}

fun Int.cetakLuas() : String {
    return "luasnya adalah $this"
}

fun Int.cetakLuas2() {
   println("luasnya adalah $this")
}

