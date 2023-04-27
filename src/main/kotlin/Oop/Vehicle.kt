package Oop

class Vehicle (owner:String, colour:String, make:String, doors:Int, price:Int){
    init {
        println("Car owner is $owner")
        println("Car colour is $colour")
        println("Car make is $make")
        println("Car has $doors doors")
        println("Car costs Ksh.$price ")
    }
}

fun main(args: Array<String>) {
    var car_one =Vehicle("Mbugua", "Gold", "Pajero", 4, 5000000)
    println("---End of car one---")
    var car_two =Vehicle("Grace", "Black", "Mercedes", 4, 6000000)
    println("---End of car two---")
    var car_three =Vehicle("James", "White", "Rav4", 4, 2000000)
    println("---End of car three---")
}