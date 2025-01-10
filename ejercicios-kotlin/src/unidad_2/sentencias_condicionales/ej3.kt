package unidad_2.sentencias_condicionales

fun ej3() {
    println("Introduce el primer número (dividendo):")
    val num1 = readLine()?.toDoubleOrNull()

    println("Introduce el segundo número (divisor):")
    val num2 = readLine()?.toDoubleOrNull()

    if (num1 != null && num2 != null) {
        if (num2 == 0.0) {
            println("Error: No se puede dividir entre cero.")
        } else {
            println("El resultado de la división es: ${num1 / num2}")
        }
    } else {
        println("Error: Entrada no válida.")
    }
}