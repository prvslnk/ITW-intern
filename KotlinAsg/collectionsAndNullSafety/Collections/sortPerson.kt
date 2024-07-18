data class Person(val name: String, val age: Int)

fun sortPeople(people: List<Person>): List<Person> {
    return people.sortedWith(compareBy<Person> { it.age }.thenBy { it.name })
}

fun main() {
    val people = listOf(
        Person("Pravas", 19),
        Person("Sandeep", 25),
        Person("Gourav", 30),
        Person("Rahul", 25)
    )
    val sortedPeople = sortPeople(people)
    println(sortedPeople)
}
