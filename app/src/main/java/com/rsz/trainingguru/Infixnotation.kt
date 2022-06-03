package com.rsz.trainingguru

fun main() {
    val result = "rodhi" convert "UP"
    println(result)
}

infix fun String.convert (type : String) : String {
    if (type == "UP"){
        return this.uppercase()
    } else{
        return this.lowercase()
    }
}