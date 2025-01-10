package unidad_3.diccionarios

fun ej7() {
    val cesta = mutableMapOf<String, Double>()
    while (true) {
        print("Ingrese el artículo (o 'terminar' para finalizar): ")
        val articulo = readLine()?.trim() ?: break
        if (articulo.lowercase() == "terminar") break
        print("Ingrese el precio de $articulo: ")
        val precio = readLine()?.toDoubleOrNull() ?: 0.0
        cesta[articulo] = precio
    }
    println("\nLista de la compra:")
    cesta.forEach { (articulo, precio) -> println("$articulo: $precio €") }
    val total = cesta.values.sum()
    println("Coste total: $total €")
}