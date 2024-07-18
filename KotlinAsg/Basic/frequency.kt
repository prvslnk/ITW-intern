fun main() {
    val text = "hello world"
    val frequencyMap = mutableMapOf<Char, Int>()

    for (char in text) {
        if (char.isLetter()) {
            frequencyMap[char] = frequencyMap.getOrDefault(char, 0) + 1
        }
    }

    println("Letter frequencies: $frequencyMap")
}
