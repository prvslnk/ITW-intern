// 1. Define a BankAccount class with properties accountNumber and balance. Implement methods deposit and withdraw to modify the balance, and getBalance to return the current balance.

class BankAccount(private val accountNumber: String, private var balance: Double) {

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited: $amount")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Withdrawn: $amount")
        } else {
            println("Insufficient balance")
        }
    }

    fun getBalance(): Double {
        return balance
    }
}

fun main() {
    val account = BankAccount("123456789", 500.0)
    account.deposit(200.0)
    account.withdraw(100.0)
    println("Current balance: ${account.getBalance()}")
}