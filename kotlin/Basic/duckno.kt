// Duck: if '0' exists in the number string excluding the first character

fun main() {
    val number = 7056030
    val numberString = number.toString()

    var isDuckNumber = false
    for (i in 1 until numberString.length) {
        if (numberString[i] == '0') {
            isDuckNumber = true
            break
        }
    }

    if (isDuckNumber) {
        println("$number is a duck number.")
    } else {
        println("$number is not a duck number.")
    }
}