package unidad_2.sentencias_iterativas

fun ej6() {
    println("Introduce un número entero positivo para la altura del triángulo:")
    val altura = readLine()?.toIntOrNull()

    if (altura != null && altura > 0) {
        for (i in 1..altura) {
            println("*".repeat(i))
        }
    } else {
        println("Error: Por favor, introduce un número entero positivo válido.")
    }
}