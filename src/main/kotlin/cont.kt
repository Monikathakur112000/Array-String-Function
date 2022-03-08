fun main(){
    var a=4
    outer@while (a>0){
        a--
        var b = 5
    inner@while(b > 0){
        if(a<=2)
            continue@outer
        println("a = $a , b = $b")
        b--
    }
    }
    var c=5
  outer@do{
        c--
        var d= 6
        inner@do{
            if(c<=3)
                continue@outer
            println("c = $c ,  d = $d")
            d--
        }while(d>0)
    }while(c>0)

    outer@for(j in 1..6)
        inner@ for (k in 1..5){
            if (j <= 4) {
                continue@outer
            }
        println(" j = $j , k = $k")
    }
         }