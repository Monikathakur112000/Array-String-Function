/* //recursion function
fun fact(x :Int): Long {
    return if (x == 1) x.toLong()
    else x * fact(x - 1)
}
fun main(){
    println("Factorial is : " + fact(6))
}*/
//Tail recursion function
fun fact( x : Int , y : Int) : Long {
    return if(x==1) y.toLong()
    else fact(x-1,y*x)
}
fun main() {
    println("Factorial is : " + fact(6,5))
}
