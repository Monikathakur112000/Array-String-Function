fun main(){
    val m=20
    val n=18
    val p=15
    if ((m>n)&&(m>p))
        println(m)
    if ((n>m)&&(n>p))
        println(n)
    if ((p>n)&&(p>m))
        println(p)
    if ((m>n)||(m>p))
        println(m)
    if ((n>m)||(n>p))
        println(n)
    if ((p>n)||(p>m))
        println(p)
    val z = false
    if(z.not())
        println("True")
    println("shift left  " + m.shl(n))
    println("unsigned shift left  " + m.ushr(n))
    println("shift right  " + m.shr(n))
    println("anding  " + m.and(n))
    println("xor  " + m.xor(n))
    println("Inverse " + m.inv())


        val planets = arrayOf("Earth", "Mars", "Venus", "Jupiter", "Saturn")
        for (i in planets.indices) {
            if(i < 2){
                continue
            }
            println(planets[i])
        }
    }


