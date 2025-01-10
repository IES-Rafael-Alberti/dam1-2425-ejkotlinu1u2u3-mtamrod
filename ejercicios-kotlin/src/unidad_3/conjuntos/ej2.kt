package unidad_3.conjuntos

fun ej2() {
    val primaria = mutableSetOf<String>()
    val secundaria = mutableSetOf<String>()

    println("Introduce los nombres de los alumnos de primaria (escribe 'x' para terminar):")
    while (true) {
        val nombre = readLine()?.trim() ?: break
        if (nombre.lowercase() == "x") break
        primaria.add(nombre)
    }

    println("Introduce los nombres de los alumnos de secundaria (escribe 'x' para terminar):")
    while (true) {
        val nombre = readLine()?.trim() ?: break
        if (nombre.lowercase() == "x") break
        secundaria.add(nombre)
    }

    println("Nombres de todos los alumnos sin repeticiones: ${primaria.union(secundaria)}")
    println("Nombres que se repiten: ${primaria.intersect(secundaria)}")
    println("Nombres de primaria que no están en secundaria: ${primaria.subtract(secundaria)}")
    println("¿Todos los nombres de primaria están en secundaria? ${primaria.all { secundaria.contains(it) }}")
}