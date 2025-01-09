package unidad_1.ejercicios_basicos

fun main() {
    print("Ingrese su peso en kg: ")
    val peso = readlnOrNull()?.toFloatOrNull()
    print("Ingrese su estatura en metros: ")
    val estatura = readlnOrNull()?.toFloatOrNull()

    if (peso != null && estatura != null && estatura > 0) {
        val imc = peso / (estatura * estatura)
        println("Tu índice de masa corporal es %.2f".format(imc))
    } else {
        println("Por favor, ingrese valores válidos.")
    }
}