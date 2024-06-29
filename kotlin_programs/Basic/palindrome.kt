// https://play.kotlinlang.org/


fun main() {
    var x = 121
    var p = x
    var rev = 0

    while (p != 0) {
        val rem = p % 10
        rev = rev * 10 + rem
        p = p / 10
    }

    if (x == rev) {
        println("Palindrome")
    } else {
        println("Not palindrome")
    }
}
