package com.example.firstmyappkotlin

interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is breaking")
    }
}

open class MobilePhone(override val maxSpeed:Double,osName: String, brand: String, model: String) :Drivable{
    private var battery =30;
    init {
        chargeBattery(20)
        println("The phone   $model from $brand uses $osName as its Operating System")
    }

    fun chargeBattery(chargedBy: Int){
        println("Battery was at $battery and is at ${battery+chargedBy} now")
        battery += chargedBy
    }

    override fun drive(): String {
       return "Witaj\n"
    }



}
fun main()
{


    var phone= MobilePhone(20.2,"Android", "Samsung", "S32")
//    phone.chargeBattery(20)
//    println(phone)

    Person("Robert","Jakubowicz")
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

    for( i in 1..10)
    {
        print("$i \n");
    }
}

fun multiplicationFunction(a: Int , b: Int): Int
{
    return a * b
}


class Person constructor(firstName: String , LastNeme:String)
{
    init {
        print("welcome $firstName travler with last name $LastNeme \n")
    }
}
fun multiplicationFunction2(a: Int , b: Int): Int =  a * b
