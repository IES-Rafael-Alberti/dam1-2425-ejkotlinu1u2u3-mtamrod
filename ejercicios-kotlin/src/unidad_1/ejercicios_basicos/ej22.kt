package unidad_1.ejercicios_basicos

fun main() {
    print("Introduce una frase: ")
    val frase = readlnOrNull() ?: ""

    print("Introduce una vocal: ")
    val vocal = readlnOrNull()?.lowercase() ?: ""

    if (vocal.length == 1 && vocal in listOf("a", "e", "i", "o", "u")) {
        val fraseModificada = frase.replace(vocal, vocal.uppercase())
        println("Frase modificada: $fraseModificada")
    } else {
        println("No has introducido una vocal válida.")
    }
}