package unidad_3.listas_tuplas

fun ej10() {
    val precios = listOf(50, 75, 46, 22, 80, 65, 8)
    val menor = precios.minOrNull()
    val mayor = precios.maxOrNull()

    println("El menor precio es: $menor")
    println("El mayor precio es: $mayor")
}