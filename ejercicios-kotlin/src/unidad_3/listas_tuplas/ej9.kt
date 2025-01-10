package unidad_3.listas_tuplas

fun ej9() {
    print("Ingrese una palabra: ")
    val palabra = readLine() ?: ""
    val vocales = listOf('a', 'e', 'i', 'o', 'u')
    val conteoVocales = mutableMapOf<Char, Int>()

    for (vocal in vocales) {
        conteoVocales[vocal] = palabra.lowercase().count { it == vocal }
    }

    println("Número de veces que aparece cada vocal:")
    for ((vocal, conteo) in conteoVocales) {
        println("$vocal: $conteo")
    }
}