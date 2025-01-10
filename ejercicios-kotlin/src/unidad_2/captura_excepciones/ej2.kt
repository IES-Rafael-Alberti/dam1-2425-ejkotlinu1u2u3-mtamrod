package unidad_2.captura_excepciones

fun ej2() {
    try {
        print("Ingresa un número entero positivo: ")
        val entrada = readLine()
        val numero = entrada?.toInt() ?: throw IllegalArgumentException("Debes introducir un número válido.")

        if (numero <= 0) {
            throw IllegalArgumentException("El número debe ser un entero positivo.")
        }

        val numerosImpares = (1..numero).filter { it % 2 != 0 }

        println("Números impares desde 1 hasta $numero: ${numerosImpares.joinToString(", ")}")
    } catch (e: NumberFormatException) {
        println("Error: La entrada debe ser un número entero.")
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    } catch (e: Exception) {
        println("Error inesperado: ${e.message}")
    }
}