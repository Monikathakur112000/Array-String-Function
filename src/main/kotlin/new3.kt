import java.util.Scanner
fun sum(a: Int,b: Int) : Int {
    return a + b
}
fun main(){

   val a = 10
    val b = 20
    println("Sum of a and b is : ${sum(a,b)}")
    print("Enter the text   ")

     val d1= readLine()
    println(d1)

    print("Enter value  ")
    val a1 =Scanner(System.`in`)
    val a2 = a1.nextLine()
    println("Integer is : $a2")

    val m1 = 20
    val m2:Float = m1.toFloat()
    println(m2)

    val m11 = 201
    val m21:Char = m11.toChar()
    println(m21)
}

