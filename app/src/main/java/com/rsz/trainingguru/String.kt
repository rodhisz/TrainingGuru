package com.rsz.trainingguru

fun main() {
    val example = """
        halo
        halo
        halo
    """.trimIndent()
    //trimindent untuk hapus sisi kosong

    val example2 = """
        halo
        halo
        halo
    """.trimMargin("$")
    //trimMargin untuk hapus sisi kosong dengan spesifik char

    println(example)
    println(example2)

    val firstname = "rodhi"
    val lastname = "sz"
    val fullname = firstname + " " + lastname
    println(fullname)

    val address = "halo nama saya $fullname, saya tinggal di bogor"
    println(address)

    //string template
    val example3 = "5 + 3 = ${5+3}"
    println(example3)

//    println(APP)

    val exampleBoolean = "nama saya sama ${firstname == lastname}"
}