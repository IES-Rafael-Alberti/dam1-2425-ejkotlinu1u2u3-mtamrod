package unidad_2.captura_excepciones

fun main() {
    var numero: Int? = null

    // Solicitar un número válido dentro de un ciclo hasta que sea correcto
    do {
        try {
            val entrada = readLine()?.toInt() ?: throw IllegalArgumentException("Debes introducir un número válido.")
            if (entrada < 0) throw IllegalArgumentException("El número debe ser un entero positivo.")
            numero = entrada

        } catch (e: NumberFormatException) {
            println("Error: La entrada debe ser un número entero válido.")
        } catch (e: IllegalArgumentException) {
            println("Error: ${e.message}")
        } catch (e: Exception) {
            println("Error inesperado: ${e.message}")
        }
    } while (numero == null)

    val cuentaAtras = (numero downTo 0).joinToString(", ")
    println("Cuenta atrás desde $numero hasta 0: $cuentaAtras")
}