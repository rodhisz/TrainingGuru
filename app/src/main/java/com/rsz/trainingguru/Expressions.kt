package com.rsz.trainingguru

fun main() {
    val nilai = 'A'

    when (nilai) {
        'A' -> println("Excellent")
        'B' -> println("Good Job")
        'C' -> println("Good")
        'D' -> println("Enough")
        'E' -> println("Enough, but you must study hard")
        else -> println("Try again next time")
    }

    when (nilai) {
        'A','B' -> println("Excellent")
        'C','D' -> println("Good Job")
        'E' -> println("Not Bad")
        else -> println("Try again next time")
    }

    val nilaiSiswa = 80..100
    val siswa = 70

    //in => cek didalam data ada ga nilai yang dicari
    when (siswa) {
        in nilaiSiswa -> println("ada")
        !in nilaiSiswa -> println("tidak ada")
    }

    //pakai when sebagai pengganti if
    val angka = 9

    when{
        angka % 2 == 0 -> println("ini adalah bilangan genap")
        angka % 2 != 0 -> println("ini adalah bilangan ganjil")
    }
}