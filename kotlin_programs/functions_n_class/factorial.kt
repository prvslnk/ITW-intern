// Q4. Create a function factorial that takes an integer n and returns the factorial of n using recursion.
fun factorial(n: Int): Int {
    return if (n <= 1) 1 else n * factorial(n - 1)
}

fun main() {
    println(factorial(5))
}