package unidad_2.sentencias_condicionales

fun ej10() {
    println("¿Quieres una pizza vegetariana? (sí/no):")
    val vegetariana = readLine()?.trim()?.lowercase()

    if (vegetariana == "sí" || vegetariana == "no") {
        println("Elige un ingrediente:")
        val ingredientes = if (vegetariana == "sí") {
            listOf("Pimiento", "Tofu")
        } else {
            listOf("Peperoni", "Jamón", "Salmón")
        }

        for ((indice, ingrediente) in ingredientes.withIndex()) {
            println("${indice + 1}. $ingrediente")
        }

        val opcion = readLine()?.toIntOrNull()
        if (opcion != null && opcion in 1..ingredientes.size) {
            val ingredienteElegido = ingredientes[opcion - 1]
            val tipoPizza = if (vegetariana == "sí") "Vegetariana" else "No Vegetariana"
            println("Has elegido una pizza $tipoPizza con los siguientes ingredientes:")
            println("- Mozzarella")
            println("- Tomate")
            println("- $ingredienteElegido")
        } else {
            println("Error: Opción no válida.")
        }
    } else {
        println("Error: Respuesta inválida. Debes responder 'sí' o 'no'.")
    }
}