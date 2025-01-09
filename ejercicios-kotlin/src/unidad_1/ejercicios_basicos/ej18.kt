package unidad_1.ejercicios_basicos

fun main() {
    print("Ingrese su nombre completo: ")
    val nombreCompleto = readlnOrNull()?.trim() ?: ""

    if (nombreCompleto.isNotEmpty()) {
        println("Nombre en minúsculas: ${nombreCompleto.lowercase()}")
        println("Nombre en mayúsculas: ${nombreCompleto.uppercase()}")
        //println("Nombre con mayúscula inicial en cada palabra: ${nombreCompleto.split(" ").joinToString(" ") { it.lowercase().replaceFirstChar { char -> char.uppercase() } }}")
        println("Nombre con mayúscula inicial en cada palabra: ${nombreCompleto.lowercase().split(" ").joinToString(" ") { it.replaceFirstChar { char -> char.uppercase() } }}")
    } else {
        println("Por favor, ingrese un nombre válido.")
    }
}