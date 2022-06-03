package com.rsz.trainingguru

fun main() {
    val siswa : Array<String> = arrayOf("ahmad", "rival", "humam", "tio")
    val siswa2 : Array<String?> = arrayOf("ahmad", "rival", "humam", "tio", null, null)

    println(siswa.size)
    println(siswa.get(0))
    println(siswa[0])

    siswa.set(1, "salim")
    println(siswa[1])

    siswa[2] = "sulaiman"
    println(siswa[2])

    siswa.forEach {
        print("nama saya $it, ")
    }

    siswa2.forEach {
        print("nama saya $it, ")
    }

    val array2 : Array<String?> = arrayOfNulls(10)
    array2.set(0, "ahmad")
    array2.forEach {
        println(it)
    }

}