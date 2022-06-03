package com.rsz.trainingguru

fun main() {
    tes()
    cetakNama("ahmad",20)
    cetakNama2("ahmad",20, "bogor")

    //named argument
    cetakNama3(alamat = "cirebon", umur = 18, nama = "tio")

    dataOrang("ahmad", 22)
}

fun tes(){
    println("halo nama saya humam")
    println("saya orang hutan")
}

fun cetakNama(nama: String, umur: Int){
    println("nama saya $nama, umur saya $umur")
}

fun cetakNama2(nama: String, umur: Int, alamat: String = ""){
    println("nama saya $nama, umur saya $umur, saya tinggal di $alamat")
}

//named argument
fun cetakNama3(nama: String, umur: Int, alamat: String = ""){
    println("nama saya $nama, umur saya $umur, saya tinggal di $alamat")
}

fun dataOrang (nama: String, umur: Int) {

// pakai if
//    if (umur > 20) {
//        println("anak dengan nama $nama, umurnya sudah dewasa")
//    } else if (umur < 17){
//        println("anak dengan nama $nama, umurnya sudah remaja")
//    } else {
//        println("anak dengan nama $nama, umurnya masih anak-anak")
//    }

//pakai when
//    val umur = umur

    when{
        umur > 20 -> println("anak dengan nama $nama, umurnya sudah dewasa")
        umur > 17 -> println("anak dengan nama $nama, umurnya sudah remaja")
        else -> println("anak dengan nama $nama, umurnya masih anak anak")
    }
}