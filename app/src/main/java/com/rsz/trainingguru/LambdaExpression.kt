package com.rsz.trainingguru

fun main() {
    val convertUppercase : (String) -> String = { name: String ->
        name.uppercase()
    }

    val name = convertUppercase("Rafael")
    println(name)

    println("------------- Lambda ---------------")

    val statusUmur : (String, Int) -> String = { nama: String, umur: Int ->
        when{
            umur > 20 -> "anak dengan nama $nama, umurnya sudah dewasa"
            umur > 17 -> "anak dengan nama $nama, umurnya sudah remaja"
            else -> "anak dengan nama $nama, umurnya masih anak anak"
        }
    }

    val status = statusUmur("Rafael", 20)
    println(status)

    println("------------- Method Reference ---------------")
    //mempersingkat code lambda dengan membuat function baru

    fun cekStatusUmur (nama: String, umur: Int) : String {
        return when{
            umur > 20 -> "anak dengan nama $nama, umurnya sudah dewasa"
            umur > 17 -> "anak dengan nama $nama, umurnya sudah remaja"
            else -> "anak dengan nama $nama, umurnya masih anak anak"
        }
    }

    val statusUmur2 : (String, Int) -> String = ::cekStatusUmur

    val status2 = statusUmur2("Rafael", 20)
    println(status2)

}