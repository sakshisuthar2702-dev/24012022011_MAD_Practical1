import java.util.Arrays

fun main() {
    println("Create Array-1 by using arrayOf() method:")
    val array1 = arrayOf(10, 90, 60, 80, 100)
    println(array1.joinToString())

    println("Create Array-2 by using Array<>():")
    val array2 = Array(5) { 0 }
    println(array2.joinToString())

    println("Create Array-3 by using Array<> and lambda function:")
    val array3 = Array(8) { it }
    println(array3.joinToString())

    println("Create Array-4 by using IntArray():")
    val array4 = IntArray(5)
    println(array4.joinToString())

    println("Create Array-5 by using intArrayOf():")
    val array5 = intArrayOf(12, 10, 1, 5, 18, 19)
    println(array5.joinToString())

    println("Create 2D Array-6 by using arrayOf() and intArrayOf():")
    val array6 = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(4, 5),
        intArrayOf(6, 7)
    )
    println(Arrays.deepToString(array6))

    // Input values
    val a = IntArray(5)
    println("Please enter Array Value:")
    for (i in 0 until 5) {
        print("a[$i]=")
        a[i] = readLine()!!.toInt()
    }

    println("Entered Array:")
    println(a.joinToString())

    // Sorting with built-in function
    println("************With Built-in Function************")
    val sortedWithBuiltIn = a.sortedArray()
    println("After sorting by built-in function:")
    println(sortedWithBuiltIn.joinToString())

    // Sorting without built-in function (Bubble Sort)
    println("************Without Built-in Function************")
    println("Before Sorting:")
    println(a.joinToString())

    for (i in 0 until a.size) {
        for (j in 0 until a.size - i - 1) {
            if (a[j] > a[j + 1]) {
                val temp = a[j]
                a[j] = a[j + 1]
                a[j + 1] = temp
            }
        }
    }

    println("After Sorting without built-in function:")
    println(a.joinToString())

    // Using various loops:
    println("\nLoop using 'for':")
    for (i in array1) print("$i ")
    println("\nLoop using 'indices':")
    for (i in array1.indices) print("${array1[i]} ")
    println("\nLoop using 'until':")
    for (i in 0 until array1.size) print("${array1[i]} ")
    println("\nLoop using 'downTo':")
    for (i in array1.size - 1 downTo 0) print("${array1[i]} ")
}
