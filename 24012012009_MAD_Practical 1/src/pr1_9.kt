fun main() {
    val a = ArrayList<Int>()

    println("Enter 5 elements:")
    for (i in 0 until 5) {
        print("a[$i] = ")
        val num = readLine()!!.toInt()
        a.add(num)
    }

    var max = a[0]
    for (i in 1 until a.size) {
        if (a[i] > max) {
            max = a[i]
        }
    }

    println("Largest element = $max")
}
