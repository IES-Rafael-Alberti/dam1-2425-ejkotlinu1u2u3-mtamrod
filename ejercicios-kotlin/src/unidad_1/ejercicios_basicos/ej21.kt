package unidad_1.ejercicios_basicos

fun main() {
    print("Introduce una frase: ")
    val frase = readlnOrNull() ?: ""

    if (frase.isNotEmpty()) {
        val fraseInvertida = frase.reversed()
        println("Frase invertida: $fraseInvertida")
    } else {
        println("No has introducido una frase.")
    }
}