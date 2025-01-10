package unidad_3.diccionarios

fun ej8() {
    print("Introduce las palabras y traducciones (formato: palabra:traducción, palabra:traducción): ")
    val entrada = readLine()?.trim() ?: ""
    val diccionario = entrada.split(",").associate {
        val (espanol, ingles) = it.split(":").map { it.trim() }
        espanol to ingles
    }

    print("Introduce una frase en español: ")
    val frase = readLine()?.trim() ?: ""
    val traduccion = frase.split(" ").joinToString(" ") { palabra ->
        diccionario[palabra] ?: palabra
    }

    println("Frase traducida: $traduccion")
}