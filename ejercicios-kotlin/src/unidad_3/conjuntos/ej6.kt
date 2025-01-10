package unidad_3.conjuntos

fun ej6() {
    val vocales = setOf('a', 'e', 'i', 'o', 'u')
    val alfabeto = ('a'..'z').toSet()
    val consonantes = alfabeto.subtract(vocales)
    val letras_comunes = vocales.intersect(consonantes)

    println("Conjunto de consonantes: $consonantes")
    println("Letras comunes entre vocales y consonantes: $letras_comunes")
}