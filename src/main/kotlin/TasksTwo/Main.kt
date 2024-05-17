package TasksTwo

fun main() {
    fun getAgeAndTemperature(age: Int, temperature: Int): String? {
        return if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            "Можна идти гулять"
        } else if (age <= 20 && temperature >= 0 && temperature <= 28) {
            "Можна идти гулять"
        } else if (age < 45 && temperature >= -10 && temperature <= 25) {
            "Можна идти гулять"
        } else {
            "Оставайтесь дома"
        }
    }

    println(getAgeAndTemperature(23, -100))
    println(getAgeAndTemperature(19, 10))
    println(getAgeAndTemperature(40, -1))
    println(getAgeAndTemperature(23, 11))
    println(getAgeAndTemperature(50, -16))
}