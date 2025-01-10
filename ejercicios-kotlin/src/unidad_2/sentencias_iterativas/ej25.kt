package unidad_2.sentencias_iterativas

fun ej25() {
    print("Ingresa una frase: ")
    val frase = readLine().orEmpty()

    val palabras = frase.split(" ").filter { it.isNotBlank() }
    val palabraMasLarga = palabras.maxByOrNull { it.length } ?: ""
    val cantidadPalabras = palabras.size

    println("La palabra más larga es: \"$palabraMasLarga\"")
    println("Cantidad de palabras: $cantidadPalabras")
}