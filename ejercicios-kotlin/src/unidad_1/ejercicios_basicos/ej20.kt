package unidad_1.ejercicios_basicos

fun main() {
    print("Ingrese un número de teléfono en formato +34-xxxxxxxxx-xx: ")
    val telefono = readlnOrNull() ?: ""

    val partes = telefono.split("-")
    if (partes.size == 3 && partes[0] == "+34") {
        val numeroSinPrefijoYExtension = partes[1]
        println("Número sin prefijo ni extensión: $numeroSinPrefijoYExtension")
    } else {
        println("El número no está en el formato esperado (+34-xxxxxxxxx-xx).")
    }
}