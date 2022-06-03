package com.rsz.trainingguru

fun main() {

    //for
    val myFriend = arrayOf("Agus", "Bimo", "Hurun")

    for (name in myFriend){
        println(name)
    }

    for (angka in 0 until 100)
    println(angka)

    for (angka in 0 until 100 step 2)
        println(angka)

    //range cetak semua misal 0..100 dia cetak sampe 100
    //until cetak semua kecuali angka yang terakhir

    //while => cek dulu baru ekseskusi
    var count = 0
    while (count <= 10){
        println("nilai $count")
        count++
    }

    //do while => ekseskusi dulu baru cek
    do {
        println("nilai $count")
        count++
    }while (count <= 10)
}