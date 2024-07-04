fun main() {
    val a = 56
    val b = 98
    var num1 = a
    var num2 = b

    while (num2 != 0) {
        val temp = num2
        num2 = num1 % num2
        num1 = temp
    }

    println("GCD of $a and $b is $num1")
}
