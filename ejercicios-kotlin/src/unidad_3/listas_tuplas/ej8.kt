package unidad_3.listas_tuplas

fun ej8() {
    print("Ingrese una palabra: ")
    val palabra = readLine() ?: ""
    val caracteres = palabra.lowercase().toList()
    val esPalindromo = caracteres == caracteres.reversed()

    if (esPalindromo) {
        println("La palabra \"$palabra\" es un palíndromo.")
    } else {
        println("La palabra \"$palabra\" no es un palíndromo.")
    }
}