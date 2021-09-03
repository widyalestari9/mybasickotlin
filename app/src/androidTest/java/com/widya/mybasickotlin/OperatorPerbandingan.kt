package com.widya.mybasickotlin

fun main (){
    val a = 4
    val b = 3

    println("a > b is ${a > b}")
    println("a = b is ${a == b}")

    val nilai = 87
    if (nilai <= 90){
        println("You get score A")
    }else if(nilai >= 75){
        println("You get score B")
    }else {
        println ("You dont get score")
    }
}