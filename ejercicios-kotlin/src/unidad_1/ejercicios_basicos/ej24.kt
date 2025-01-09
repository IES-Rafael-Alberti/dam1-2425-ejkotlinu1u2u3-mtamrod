package unidad_1.ejercicios_basicos

fun main() {
    print("Introduce el precio del producto en euros (con dos decimales): ")
    val input = readlnOrNull() ?: ""

    try {
        // Convertir el input a decimal (Float)
        val precio = input.toFloat()

        // Separar los euros y céntimos
        val euros = precio.toInt() // Parte entera (euros)
        val centimos = ((precio * 100) % 100).toInt() // Parte decimal convertida a céntimos

        // Mostrar el resultado
        println("Euros: $euros")
        println("Céntimos: $centimos")
    } catch (e: NumberFormatException) {
        println("Por favor, introduce un precio válido con dos decimales (ejemplo: 12.34).")
    }
}