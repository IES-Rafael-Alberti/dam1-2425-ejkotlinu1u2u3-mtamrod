package unidad_1.ejercicios_basicos

fun main() {
    print("Introduce el nombre del producto: ")
    val nombreProducto = readlnOrNull() ?: ""

    print("Introduce el precio del producto (por unidad): ")
    val precioUnitarioEntrada = readlnOrNull() ?: "0.0"
    val precioUnitario = precioUnitarioEntrada.toFloatOrNull() ?: 0.00f

    print("Introduce el número de unidades: ")
    val unidadesEntrada = readlnOrNull() ?: "0"
    val numeroUnidades = unidadesEntrada.toIntOrNull() ?: 0

    val costeTotal = precioUnitario * numeroUnidades.toFloat()

    val nombreFormateado = nombreProducto.take(20) // Limitar el nombre a 20 caracteres, si es necesario
    val precioFormateado = "%06.2f".format(precioUnitario) // Formato con 6 dígitos enteros y 2 decimales
    val unidadesFormateadas = "%03d".format(numeroUnidades) // Número de unidades con 3 dígitos
    val costeFormateado = "%08.2f".format(costeTotal) // Coste total con 8 dígitos enteros y 2 decimales

    println("\nResultado:")
    println("$nombreFormateado | Precio Unitario: $precioFormateado | Unidades: $unidadesFormateadas | Coste Total: $costeFormateado")
}