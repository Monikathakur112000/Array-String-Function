@file:Suppress("DEPRECATED_IDENTITY_EQUALS")

fun main() {
    val planet= arrayOf("Earth","Sun","Mars","Jupiter","Mercury","Pluto")

    var a = 0
    do {
        println("Element at $a is " + planet[a])
        if (planet[a] == "Mercury"){
            println("Unlabeled  \n break \r in \'the \b do \t while loop")
        break}
       a++
    }
    while(a <=planet.size)


    val name = "Unlabeled"
    for (i in name){
        print(i)
        if(i == 'a') {
            break
        }
    }
    var m = 5
    outer@ do {
        var n = 6
        inner@ do {
            if (m == 3)
                break@outer
                println(" m value : $m , n value : $n")
                n--
        }
        while(n>0)
                m--
    }while(m>0)
val x=10
    val y=12
    val z= 12
    println(x!=y)
    println(x==z)
    println(x===y)
    println(x===z)
    println(x!==y)


}




