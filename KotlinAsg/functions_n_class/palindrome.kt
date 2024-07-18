//  Q2. Write a function sumOfList that takes a list of integers and returns the sum of all elements.

fun isPalindrome(input: String): Boolean {

    val lowerCaseInput = input.toLowerCase()
    val reversedInput = lowerCaseInput.reversed()
    return lowerCaseInput == reversedInput
}

fun main() {
    println(isPalindrome("Racecar"))
    println(isPalindrome("Hello"))
   
}