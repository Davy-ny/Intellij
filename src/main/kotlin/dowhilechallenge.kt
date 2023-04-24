fun main(args: Array<String>) {
    var pin:Int = 1220
    do {
        println("Enter your Pin")
        pin = readln()!!.toInt()
    } while (pin != 1220)
    println("Correct pin")
}