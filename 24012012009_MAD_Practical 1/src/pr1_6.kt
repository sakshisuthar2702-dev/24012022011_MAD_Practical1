fun factorial(n: Int): Long {
    return if (n == 0) 1 else n * factorial(n - 1)
}

tailrec fun tailRecFactorial(n: Int, result: Long = 1): Long {
    return if (n == 0) result else tailRecFactorial(n - 1, result * n)
}

fun main() {
    print("Enter Number: ")
    val number = readLine()!!.toInt()

    println("Factorial of $number = ${factorial(number)}")
    println("By TailRec Keyword, Factorial of $number = ${tailRecFactorial(number)}")
}
