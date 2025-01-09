package unidad_2.sentencias_iterativas

fun ej18() {
    var cantidadPares = 0
    var numero: Int?

    println("Introduce números enteros positivos (-1 para terminar):")

    do {
        numero = readLine()?.toIntOrNull()

        // Validar entrada
        if (numero == null || numero < -1) {
            println("Por favor, introduce un número válido (un entero positivo o -1 para salir).")
        } else if (numero != -1) {
            // Calcular suma de los dígitos
            val sumaDigitos = numero.toString().map { it.toString().toInt() }.sum()
            println("La suma de los dígitos de $numero es: $sumaDigitos")

            // Contar si el número es par
            if (numero % 2 == 0) {
                cantidadPares++
            }
        }
    } while (numero != -1)

    println("Cantidad de números pares ingresados: $cantidadPares")
}