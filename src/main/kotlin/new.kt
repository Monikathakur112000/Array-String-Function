

fun main() {
    val a=12
    println(a)
    val a1:Byte =Byte.MIN_VALUE
    val a2:Byte =Byte.MAX_VALUE
    println("Minimum value = $a1")
    println("Max value $a2")
    val alpha = 'i'
 println(alpha)
    val alphabet = 'C'
    println("C is a character : $alphabet is Char")

    val b1=12
    val b2=16
    println(b1+b2)
    println(b1%b2)
    println(b1.rem(b2))
    println(" If b1 is greater than b2:" +(b1>b2))
    println(" If b2 is greater than b2: " +(b1<b2))
    println(" If b1 is equal b2:" +(b1==b2))
    println(" If b1 is not equal to b2: " +(b1!=b2))
    var c=11
    val d=21
    c+=d
    println(c)
    c-=d
    println(c)
    c*=d
    println(c)
    var e=7
    println("Increment : " + e++)
    println("Increment : " +  ++e)
    println("decrement : " + e--)
    println("decrement : " + --e)


}