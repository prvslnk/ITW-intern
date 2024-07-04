fun stringsToLengths(strings: List<String>): Map<String, Int> {
    val lengthsMap = mutableMapOf<String, Int>()
    for (string in strings) {
        lengthsMap[string] = string.length
    }
    return lengthsMap
}

fun main() {
    val strings = listOf("apple", "banana", "mango")
    println(stringsToLengths(strings)) 
}
