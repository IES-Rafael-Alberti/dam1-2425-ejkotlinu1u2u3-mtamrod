package unidad_2.sentencias_iterativas

fun ej19() {
    var opcion: Int?

    do {
        println(
            """
            Menú:
            1- Comenzar programa
            2- Imprimir listado
            3- Finalizar programa
            Selecciona una opción:
            """
        )
        opcion = readLine()?.toIntOrNull()
        when (opcion) {
            1 -> println("Opción 1 seleccionada: ¡El programa ha comenzado!")
            2 -> println("Opción 2 seleccionada: Aquí tienes el listado...")
            3 -> println("Opción 3 seleccionada: Finalizando programa. ¡Hasta luego!")
            else -> println("Error: Opción incorrecta. Por favor, selecciona una opción válida.")
        }
        println()
    } while (opcion != 3)
}