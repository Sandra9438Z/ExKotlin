fun tip(bill: Int, percentage: Int = 10): Int {
    return bill/ percentage
}

fun main() {
    println(tip(100))
    println(tip(100, 5))
}