fun reverseList(numbers: List<Int>): List<Int> {
    val reversedList = mutableListOf<Int>()
    for (i in numbers.size - 1 downTo 0) {
        reversedList.add(numbers[i])
    }
    return reversedList
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    println(reverseList(numbers))
}
