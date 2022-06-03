package com.rsz.trainingguru

fun main() {
    val umur = dataUmur("budi", 45)
    println(umur)
}

fun dataUmur (nama: String, umur: Int) : String {

    return when{
        umur > 20 -> "anak dengan nama $nama, umurnya sudah dewasa"
        umur > 17 -> "anak dengan nama $nama, umurnya sudah remaja"
        else -> "anak dengan nama $nama, umurnya masih anak anak"
    }
}