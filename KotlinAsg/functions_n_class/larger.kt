//  Q1. Write a function that takes two integers and returns the larger of the two.

fun largerNumber(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun main() {
    println(largerNumber(5, 10))
}