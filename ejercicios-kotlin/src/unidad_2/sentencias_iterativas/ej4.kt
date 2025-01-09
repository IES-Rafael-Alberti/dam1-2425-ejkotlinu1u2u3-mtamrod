package unidad_2.sentencias_iterativas

fun ej4() {
    println("Introduce un número entero positivo:")
    val numero = readLine()?.toIntOrNull()

    if (numero != null && numero >= 0) {
        println("Cuenta atrás:")
        println((numero downTo 0).joinToString(", "))
    } else {
        println("Error: Por favor, introduce un número entero positivo válido.")
    }
}