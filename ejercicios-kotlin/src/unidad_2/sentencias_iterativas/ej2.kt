package unidad_2.sentencias_iterativas

fun ej2() {
    println("Introduce tu edad:")
    val edad = readLine()?.toIntOrNull()

    if (edad != null && edad > 0) {
        println("Has cumplido los siguientes años:")
        for (i in 1..edad) {
            println(i)
        }
    } else {
        println("Error: Por favor, introduce una edad válida (un número mayor que 0).")
    }
}