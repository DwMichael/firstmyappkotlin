package com.example.firstmyappkotlin

fun main()
{
    var myName : String  = " Michał";
    var flaost :Float = 23.23F
    var numberD : Double = 23.2223232
    var numberS : Short = 23
    var number : Int = 2020
    var numberLong : Long = 20231023012310
    var bole : Boolean = true
    var charr: Char = 'w'

    println("Hello " + myName +"\n")
    print("${multiplicationFunction(9,3)} <- Pierwsza funkcja \n")
    print("${multiplicationFunction2(8,8)} <- Druga Funkcja \n"   )
}

fun multiplicationFunction(a: Int , b: Int): Int
{
    return a * b
}

fun multiplicationFunction2(a: Int , b: Int): Int =  a * b
