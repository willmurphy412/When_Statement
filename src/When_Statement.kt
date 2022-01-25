fun main() {
    var number = 30
    var numString = "x"

    println("Please enter a number between 1 and 10: ")
    number = readLine()!!.toInt()

    when (number){
        1 -> numString = "Eins"
        2 -> numString = "Zwei"
        3 -> numString = "Drei"
        4 -> numString = "Vier"
        5 -> numString = "Funf"
        6 -> numString = "Sechs"
        7 -> numString = "Sieben"
        8 -> numString = "Acht"
        9 -> numString = "Nuen"
        10 -> numString = "Zehn"
        !in 1..10 -> numString = "Out of Range"
        else -> numString = "Unknown"
    }
    if (number >= 1 && number <= 10)
        println("The number $number is $numString in German")
    else
        println("The number $number is $numString")
}