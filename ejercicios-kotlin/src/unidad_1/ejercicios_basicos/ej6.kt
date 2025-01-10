package unidad_1.ejercicios_basicos

fun main() {
    print("Ingrese el importe final del artículo: ")
    val importeFinal = readlnOrNull()?.toFloatOrNull()
    if (importeFinal != null) {
        val importeSinIVA = importeFinal / 1.10
        val iva = importeFinal - importeSinIVA
        println("Importe sin IVA: %.2f".format(importeSinIVA) + "€")
        println("IVA pagado: %.2f".format(iva) + "€")
    } else {
        println("Por favor, ingrese un número válido.")
    }
}