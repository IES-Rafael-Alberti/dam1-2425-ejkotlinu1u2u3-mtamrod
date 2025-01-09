package unidad_2.sentencias_condicionales

fun ej6() {
    println("Introduce tu nombre:")
    val nombre = readLine()?.trim()?.capitalize() ?: ""

    println("Introduce tu sexo (M para mujer, H para hombre):")
    val sexo = readLine()?.trim()?.uppercase() ?: ""

    if (nombre.isNotEmpty() && (sexo == "M" || sexo == "H")) {
        val grupo = when {
            sexo == "M" && nombre < "M" -> "A"
            sexo == "H" && nombre > "N" -> "A"
            else -> "B"
        }
        println("Tu grupo es: $grupo")
    } else {
        println("Error: Entrada inválida.")
    }
}