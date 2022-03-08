import java.util.Scanner
//Scanner method for input by user
fun main() {
    val a = Scanner(System.`in`)
    print("Enter the value of a1 : ")
    val a1 = a.nextInt()
    print("Enter the value of a2 : ")
    val a2 = a.nextInt()
    print("Enter the value of a3 : ")
    val a3 = a.nextInt()
    // if else and elseif expression
    if(a1>a2){
        if(a1>a3)
            println("$a1 is larger")
        else
            println("$a3 is larger")
    }
    else if(a2>a3)
        println("$a2 is greater")
    else
        println("$a3 is greater")
// Unlabeled continue in while and do while loop
    var x=0
    while(x<=15){
        if(x%4==0){
            x++
        continue}
        println(x)
        x++

    }
    var num = 0
    do {
        if (num < 10 || num > 20) {
            num++
            continue
        }

        println(num)
            num++
    }
    while(num<20)

    //string
val str = """Mercury 
    |is nearest 
    |to the sun""".trimMargin()
    println(str)
}