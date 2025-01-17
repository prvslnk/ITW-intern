fun isSubset(list1: List<Int>, list2: List<Int>): Boolean {
    for (item in list1) {
        if (item !in list2) {
            return false
        }
    }
    return true
}

fun main() {
    val list1 = listOf(1, 2, 3)
    val list2 = listOf(1, 2, 3, 4, 5)
    println(isSubset(list1, list2))
}
