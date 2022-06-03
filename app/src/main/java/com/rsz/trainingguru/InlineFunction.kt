package com.rsz.trainingguru

fun main() {

    println(hello2 { "Hello".uppercase() })

}

inline fun hello2(nama : () -> String) : String {
    return nama()
}


//inline khusus paramater lambda