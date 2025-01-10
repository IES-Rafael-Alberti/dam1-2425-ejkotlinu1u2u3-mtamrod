package unidad_2.sentencias_iterativas

fun ej15() {
    var sumaPositivos = 0
    var numero: Int?

    println("Introduce números enteros (ingresa 0 para terminar):")
    do {
        numero = readLine()?.toIntOrNull()

        if (numero != null && numero > 0) {
            sumaPositivos += numero
        } else if (numero == null) {
            println("Por favor, introduce un número entero válido.")
        }
    } while (numero != 0)

    println("La sumatoria de los números positivos ingresados es: $sumaPositivos")
}