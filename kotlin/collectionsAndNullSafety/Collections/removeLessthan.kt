fun filterLessThan(numbers: List<Int>, n: Int): List<Int> {
    val filteredList = mutableListOf<Int>()
    for (number in numbers) {
        if (number >= n) {
            filteredList.add(number)
        }
    }
    return filteredList
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val n = 3
    println(filterLessThan(numbers, n))
}
