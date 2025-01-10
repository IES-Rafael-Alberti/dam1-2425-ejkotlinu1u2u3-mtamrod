package unidad_3.diccionarios

fun ej6() {
    val persona = mutableMapOf<String, String>()
    while (true) {
        print("Ingrese el tipo de dato (o 'salir' para finalizar): ")
        val clave = readLine()?.trim() ?: break
        if (clave.lowercase() == "salir") break
        print("Ingrese el valor para $clave: ")
        val valor = readLine()?.trim() ?: ""
        persona[clave] = valor
        println("Diccionario actualizado: $persona")
    }
}