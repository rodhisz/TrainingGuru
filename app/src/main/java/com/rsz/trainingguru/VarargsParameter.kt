package com.rsz.trainingguru

fun main() {

    finalValue("ahmad", 21,21,21,32)

}

//varargs untuk parameter yang isinya banyak
fun finalValue(nama: String, vararg values:Int){
    var total = 0

    for (nilai in values){
        total += nilai
    }

    println("$nama, total nilai anda adalah $total")
}