fun main(){
    var a1=2
    while (a1<=10){
        println(a1)
        a1++
    }
    var a=1
    do {
        println("2 x $a = "  + 2*a)
        a++
    }
        while(a<11)

    for(i in 1..7 step 4)
        println(i)
    for(i in 7 downTo 2 step 2)
        println(i)

    val num1 = arrayOf(1,2,3,4,5)
    for(num in num1.indices)
        if(num%2==0)
            println(num)
    for((index,value) in num1.withIndex())
        println("Element at $index is $value")
    val m = "alphabet"
    val n = "get"
    println(m.length)
    println(m[5])
    println(m.subSequence(2,7))
    println(m.compareTo(n))
    for(i in m.indices)
        println(m[i]+"")
    for((index,value) in m.withIndex())
        println("Element at $index is $value")
    val d =listOf(1,2,3,"map","alphabet" )
    for( i in d)
        println(i)
}




