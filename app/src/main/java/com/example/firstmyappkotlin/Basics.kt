package com.example.firstmyappkotlin

fun main()
{
print("${multiplicationFunction(9,3)} <- Pierwsza funkcja \n")
print("${multiplicationFunction2(8,8)} <- Druga Funkcja \n"   )
}

fun multiplicationFunction(a: Int , b: Int): Int
{
    return a * b
}

fun multiplicationFunction2(a: Int , b: Int): Int =  a * b
