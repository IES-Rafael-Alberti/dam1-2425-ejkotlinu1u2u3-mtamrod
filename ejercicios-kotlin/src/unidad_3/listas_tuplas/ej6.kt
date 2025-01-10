package unidad_3.listas_tuplas

fun ej6() {
    val asignaturas = mutableListOf("Matemáticas", "Física", "Química", "Historia", "Lengua")
    val asignaturasRepetidas = mutableListOf<String>()

    asignaturas.forEach { asignatura ->
        print("Ingresa la nota para $asignatura: ")
        val nota = readLine()?.toFloatOrNull() ?: 0f
        if (nota < 5) asignaturasRepetidas.add(asignatura)
    }

    if (asignaturasRepetidas.isEmpty()) {
        println("¡Felicidades! No tienes asignaturas que repetir.")
    } else {
        println("Debes repetir las siguientes asignaturas: ${asignaturasRepetidas.joinToString(", ")}")
    }
}