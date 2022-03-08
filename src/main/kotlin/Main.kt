

fun multiply(a: Int = 2, b : Int=3) :Int {
    return a * b
}

fun main() {
    val f=14
    val g =4
    val c=multiply(11,21)//all
    val d=multiply()// no argument
    val e=multiply(12)//partial
    val h=multiply(a=f,b=g)//named argument
    println(h)
    println(e)
    println(c)
    println(d)
}




