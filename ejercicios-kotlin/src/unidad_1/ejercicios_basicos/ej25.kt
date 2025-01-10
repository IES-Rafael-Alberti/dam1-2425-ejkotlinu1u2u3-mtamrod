package unidad_1.ejercicios_basicos

fun main() {
    print("Introduce tu fecha de nacimiento (formato dd/mm/aaaa o d/m/aaaa): ")
    val fecha = readlnOrNull() ?: ""

    // Separar la fecha en día, mes y año
    val partes = fecha.split("/")

    if (partes.size == 3) {
        try {
            val dia = partes[0].toInt()
            val mes = partes[1].toInt()
            val anio = partes[2].toInt()

            // Verificar si los valores son válidos (in para saber si está entre los 2 parámetros introducidos)
            if (dia in 1..31 && mes in 1..12 && anio >= 0) {
                println("Día: $dia")
                println("Mes: $mes")
                println("Año: $anio")
            } else {
                println("La fecha ingresada no es válida.")
            }
        } catch (e: NumberFormatException) {
            println("Por favor, introduce una fecha válida en formato dd/mm/aaaa o d/m/aaaa.")
        }
    } else {
        println("Por favor, introduce una fecha válida en formato dd/mm/aaaa o d/m/aaaa.")
    }
}