import java.util.Scanner
// when as a statement and expression
fun main(){
    val a = Scanner(System.`in`)
    print("Enter data = ")
    when(a.next()) {
        "2"-> println("It is even")
        "3"-> println("It is odd")
        else->println("Neither even nor odd")
    }
    val b = Scanner(System.`in`)
    print("Enter the value ")
    val month= when(b.next()) {
        "1" -> println("Jan")
        "2" -> println("Feb")
        "3" -> println("March")
        "4" -> println("April")
        else -> println("Not present")
    }
    println(month)

    var n = 1
    while(n<Int.MAX_VALUE) {
        println(n++)
        if (n == 10)
            break
    }
    println("Value of n = $n")


}