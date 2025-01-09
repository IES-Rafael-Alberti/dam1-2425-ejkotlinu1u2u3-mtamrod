package unidad_1.ejercicios_basicos

fun main() {
    print("Ingrese la temperatura en grados Celsius: ")
    val celsius = readlnOrNull()?.toFloatOrNull()
    if (celsius != null) {
        val fahrenheit = (celsius * 9 / 5) + 32
        println("$celsius°C equivale a $fahrenheit°F")
    } else {
        println("Por favor, ingrese un número válido.")
    }
}