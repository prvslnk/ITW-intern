//  Q3. Implement a function named isPalindrome that checks whether a given string is a palindrome (reads the same backward as forward).

fun sumOfList(numbers: List<Int>): Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}

fun main() {
    println(sumOfList(listOf(1, 2, 3, 4, 5)))
}