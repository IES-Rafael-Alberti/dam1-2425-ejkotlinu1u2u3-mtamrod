package unidad_1.ejercicios_basicos

fun main() {
    print("Introduce los productos de tu cesta de la compra, separados por comas: ")
    val input = readlnOrNull() ?: ""

    // Dividir los productos por comas y eliminar espacios adicionales
    val productos = input.split(",").map { it.trim() } //map se usa para limpiar todos los espacios adicionales con el trim

    // Mostrar los productos, uno por línea
    println("Tus productos son:")
    for (producto in productos) {
        if (producto.isNotEmpty()) { // Evitar líneas vacías
            println("- $producto")
        }
    }
}