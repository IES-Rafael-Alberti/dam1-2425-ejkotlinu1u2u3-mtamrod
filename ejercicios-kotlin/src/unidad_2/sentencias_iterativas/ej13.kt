package unidad_2.sentencias_iterativas

fun ej13() {
    var input: String?

    println("Escribe algo (escribe 'salir' para terminar):")
    do {
        input = readLine()
        if (input != null && input.lowercase() != "salir") {
            println("Eco: $input")
        }
    } while (input != null && input.lowercase() != "salir")

    println("Programa terminado.")
}