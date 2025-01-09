package unidad_2.sentencias_condicionales

fun ej8() {
    println("Introduce tu puntuación (0.0, 0.4, 0.6 o más):")
    val puntuacion = readLine()?.toDoubleOrNull()

    if (puntuacion != null) {
        val nivel = when {
            puntuacion == 0.0 -> "Inaceptable"
            puntuacion == 0.4 -> "Aceptable"
            puntuacion >= 0.6 -> "Meritorio"
            else -> null // En caso de que no sea uno de los valores válidos
        }

        if (nivel != null) {
            val dinero = 2400 * puntuacion
            println("Nivel obtenido: $nivel")
            println("Dinero conseguido: €$dinero")
        } else {
            println("Error: Puntuación no válida. Debe ser 0.0, 0.4 o 0.6 o superior.")
        }
    } else {
        println("Error: Entrada no válida. Por favor, introduce un número.")
    }
}