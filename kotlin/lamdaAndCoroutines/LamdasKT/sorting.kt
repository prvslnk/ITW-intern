fun main() {
    val list = listOf("Pravas" to 19, "Sachin" to 25, "Gourav" to 20)
    println(sortByAge(list))
}

fun sortByAge(pairs: List<Pair<String, Int>>): List<Pair<String, Int>> {
    return pairs.sortedBy { it.second }
}
