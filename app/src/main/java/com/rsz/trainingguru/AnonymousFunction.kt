package com.rsz.trainingguru

fun main() {
    val upperCaseAnon = fun(value : String) : String {
        return value.uppercase()
    }

    val result = hello("World", upperCaseAnon)
    println(result)

    println("------------------")

    val umur = fun(nama : String, umur : Int) :String {
        return when {
            umur > 20 -> "anak dengan nama $nama, umurnya sudah dewasa"
            umur > 17 -> "anak dengan nama $nama, umurnya sudah remaja"
            else -> "anak dengan nama $nama, umurnya masih anak anak"
        }
    }

    val cekUmur = umur("Bubu", 15)
    println(cekUmur)

    println("--------- Anonymous function as parameter ----------")

    // contoh 1
    val result2 = hello("world", fun(value : String) : String {
        return value.lowercase()
    })
    println(result2)

    // contoh 2
    val result3 = cekUmur("Bubu", 19, fun (nama : String, umur : Int) : String {
        return when {
            umur > 20 -> "anak dengan nama $nama, umurnya sudah dewasa"
            umur > 17 -> "anak dengan nama $nama, umurnya sudah remaja"
            else -> "anak dengan nama $nama, umurnya masih anak anak"
        }
    })

    println(result3)
}

//anonymous function salah satu fitur di kotlin untuk membuat function tanpa nama

