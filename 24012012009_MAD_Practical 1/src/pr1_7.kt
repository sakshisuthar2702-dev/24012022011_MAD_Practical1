fun add(a: Int, b: Int, c: Int): Int = a + b + c
fun subtract(a: Int, b: Int, c: Int): Int = a - b - c
fun multiply(a: Int, b: Int, c: Int): Int = a * b * c
fun divide(a: Int, b: Int): Int = a / b

fun main() {
    val a = 111
    val b = 2222
    val c = -222

    println("Addition of $a, $b, $c is ${add(a, b, c)}")
    println("Subtraction of $a, $b, $c is ${subtract(a, b, c)}")
    println("Multiplication of $a, $b, $c is ${multiply(a, b, c)}")
    println("Division of $b, $a is ${divide(b, a)}")
}
