fun main(){
// Array
    val digit=arrayOf (1,2,3,4,5,6,7,8,9,10)
    digit[1] = 12
    digit[4] = 8

    println(digit[1])
    println(digit[4])

    // Array
    for(element in digit)
        println(element)

    val arrayname = Array(5) { i -> i * 1 }

    for (element in arrayname)
    {
        println(element)
    }

}