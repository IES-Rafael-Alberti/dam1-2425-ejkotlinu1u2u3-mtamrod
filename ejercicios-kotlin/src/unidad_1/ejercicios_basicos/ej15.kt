package unidad_1.ejercicios_basicos

fun main() {
    print("Ingrese la cantidad de dinero depositada en la cuenta de ahorros: ")
    val depositoInicial = readlnOrNull()?.toFloatOrNull()

    if (depositoInicial != null) {
        val interes = 0.04

        val balanceAno1 = depositoInicial * (1 + interes)
        val balanceAno2 = balanceAno1 * (1 + interes)
        val balanceAno3 = balanceAno2 * (1 + interes)

        println("Cantidad de ahorros tras el primer año: %.2f".format(balanceAno1))
        println("Cantidad de ahorros tras el segundo año: %.2f".format(balanceAno2))
        println("Cantidad de ahorros tras el tercer año: %.2f".format(balanceAno3))
    } else {
        println("Por favor, ingrese valores válidos.")
    }
}