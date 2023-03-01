fun main() {
    while (true) {
        var sum = readln().toInt()
        val userStatusPremium: Boolean = readln().toBoolean()
        sum = if (sum in 0..1000) sum else if (sum in 1001..10000) sum-100 else if (sum > 10000) sum/100*95 else 0
        val result = if (userStatusPremium)sum-sum/100 else sum
        println(result)
    }
}