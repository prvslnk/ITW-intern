fun main() {
    val number = 153
    var temp = number
    var sum = 0

    while (temp != 0) {
        val digit = temp % 10
        sum += digit * digit * digit
        temp /= 10
    }

    if (sum == number) {
        println("$number is an Armstrong number.")
    } else {
        println("$number is not an Armstrong number.")
    }
}