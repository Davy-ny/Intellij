package Oop

class House(owner:String, location:String, price:Int, doors:Int) {
    //initialize our class
    init {
        println("Owner of the house is $owner")
        println("House is located in $location")
        println("Price is $price")
        println("House has $doors number of doors")
    }
}

fun main(args: Array<String>) {
    var owner_one = House("Mike","Ngara",25000, 2)
    println("---End of house one")
    var owner_two = House("Sue","Kite",35000, 5)
    println("---End of house two")
    var owner_three = House("Anne","South B",45000, 3)
    println("---End of house three")
}
