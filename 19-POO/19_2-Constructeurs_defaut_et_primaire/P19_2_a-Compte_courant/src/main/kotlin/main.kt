// write the BankAccount class here
class BankAccount(var depositedv: Long, var wihtdraw: Long){
    var balance: Long = depositedv-wihtdraw
}


fun main() {
    val account = BankAccount(100, 20)
    println(account.balance)
}