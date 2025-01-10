package unidad_3.conjuntos

fun ej5() {
    val numeros = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val pares = numeros.filter { it % 2 == 0 }.toSet()
    val multiplos_de_tres = numeros.filter { it % 3 == 0 }.toSet()
    val pares_y_multiplos_de_tres = pares.intersect(multiplos_de_tres)

    println("Números pares: $pares")
    println("Números múltiplos de tres: $multiplos_de_tres")
    println("Intersección (pares y múltiplos de tres): $pares_y_multiplos_de_tres")
}