package unidad_3.listas_tuplas

import kotlin.math.sqrt

fun ej13() {
    print("Ingrese una muestra de números separados por comas: ")
    val numeros = readLine()?.split(",")?.map { it.trim().toDouble() } ?: emptyList()
    val media = numeros.average()
    val desviacionTipica = sqrt(numeros.map { (it - media) * (it - media) }.average())
    println("Media: $media")
    println("Desviación Típica: $desviacionTipica")
}