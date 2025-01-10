package unidad_2.captura_excepciones

fun ej4() {
    try {
        print("Ingresa un número entero: ")
        val numero = readLine()?.toInt() ?: throw IllegalArgumentException("Entrada no válida.")
        println("Número ingresado: $numero")
    } catch (e: Exception) {
        println("La entrada no es correcta")
        throw e
    }
}