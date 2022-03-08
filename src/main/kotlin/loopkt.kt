import java.util.Scanner

fun main() {

    // create an object for scanner class
    val reader = Scanner(System.`in`)
    print("Enter three numbers: ")

    val num1 = reader.nextInt()
    val num2 = reader.nextInt()
    val num3 = reader.nextInt()

    val max = if ( num1 > num2) {
        if (num1 > num3) {
            "$num1 is the largest number"
        }
        else {
            "$num3 is the largest number"
        }
    }
    else if( num2 > num3){
        "$num2 is the largest number"
    }
    else{
        "$num3 is the largest number"
    }
    println(max)

}
