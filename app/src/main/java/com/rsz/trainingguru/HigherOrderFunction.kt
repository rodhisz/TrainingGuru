package com.rsz.trainingguru

fun main() {
    //diatas sini lanjutan dari lambdanya
    val upperCase = { name: String -> name.uppercase() }
    val lowerCase = { name: String -> name.lowercase() }

    println(hello("John", upperCase))
    println(hello("John", lowerCase))

    println("----------------------------")

    val status = { nilai: Int ->
        if (nilai % 2 == 0) {
            "Genap"
        } else {
            "Ganjil"
        }
    }

    println(cekNilai(20, status))

    println("----------------------------")

    val cekDataUmur = { nama: String, umur: Int ->
        when {
            umur > 20 -> "anak dengan nama $nama, umurnya sudah dewasa"
            umur > 17 -> "anak dengan nama $nama, umurnya sudah remaja"
            else -> "anak dengan nama $nama, umurnya masih anak anak"
        }
    }

    println(cekUmur("Rival", 15, cekDataUmur))

    println("-------------Trailling Lambda---------------")

    val cekDataUmur2 = cekUmur("Rival", 15) { nama: String, umur: Int ->
        when {
            umur > 20 -> "anak dengan nama $nama, umurnya sudah dewasa"
            umur > 17 -> "anak dengan nama $nama, umurnya sudah remaja"
            else -> "anak dengan nama $nama, umurnya masih anak anak"
        }
    }

    println(cekDataUmur2)

    println(cekNilai(20) { nilai: Int ->
        if (nilai % 2 == 0) {
            "Genap"
        } else {
            "Ganjil"
        }
    })
}

// function punya 2 parameter, 1 parameter biasa, 1 parameter lambda
//dibawah ini lambdanya
fun hello(value: String, convert: (String) -> String): String {
    return "Halo nama saya ${convert(value)}"
}

fun cekNilai(nilai: Int, status: (Int) -> String): String {
    return "Nilai $nilai adalah ${status(nilai)}"
}

fun cekUmur(nama: String, umur: Int, cekStatusUmur: (nama: String, umur: Int) -> String): String {
    return cekStatusUmur(nama, umur)
}