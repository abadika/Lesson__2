package TasksThre

fun main() {
    val array = arrayOf(8.0, -2.6, -4.0, 2.5, 3.0, 6.0, -5.0, 7.3, -1.0, 9.0, 10.0, -3.7, 4.0, 12.3, -6.9)
    var negativeFound = false
    var countPositiveAfterNegative = 0
    var sumPositiveAfterNegative = 0.0

    array.forEach {
        if (it < 0) negativeFound = true
        else if (negativeFound) {
            countPositiveAfterNegative++
            sumPositiveAfterNegative += it
        }
    }
    val average = if (countPositiveAfterNegative > 0) sumPositiveAfterNegative / countPositiveAfterNegative else 0.0

    println("Среднее арифметическое положительных чисел после первого отрицательного числа: $average")
}