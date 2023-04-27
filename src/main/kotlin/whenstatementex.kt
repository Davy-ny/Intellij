fun main(args: Array<String>) {

    var dial:String
    println("dial number")
    dial = readln()!!.toString()
    if(dial == "*544#") {
        println("Welcome to Safaricom")
        println("1.Data Deals")
        println("2.Daily Bundles")
        println("3.Weekly Bundles")
        println("4.GO MONTHLY")
        println("5.No Expiry")
    }
    else{
        println("Invalid MMI code")
    }
    var num:Int

    println("Enter number")
    num = readln()!!.toInt()
    when(num){
        1-> println("Data Deals")
        2-> println("Daily Bundles")
        3-> println("Weekly Bundles")
        4-> println("GO MONTHLY")
        5-> println("No Expiry")
    }
}