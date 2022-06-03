package com.rsz.trainingguru

const val APP = "TrainingGuru"

fun main() {
    var myName : String? = "Muhammad Rizwan"
    println(myName?.length)
    myName = null
    println(myName?.length)
}