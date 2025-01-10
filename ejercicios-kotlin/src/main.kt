fun main() {
    while (true) {
        println("=== MENÚ PRINCIPAL ===")
        println("1. KOTLIN BÁSICO - Ej-U1")
        println("2. KOTLIN BÁSICO - Ej-U2")
        println("3. KOTLIN BÁSICO - Ej-U3")
        println("X. SALIR")
        print("Selecciona una opción: ")
        when (readLine()?.trim()?.uppercase()) {
            "1" -> mostrarMenuUnidad1()
            "2" -> mostrarMenuUnidad2()
            "3" -> mostrarMenuUnidad3()
            "X" -> {
                println("Saliendo del programa...")
                break
            }
            else -> println("Opción inválida, por favor intenta de nuevo.")
        }
    }
}

// Menú para la UNIDAD 1
fun mostrarMenuUnidad1() {
    while (true) {
        println("=== MENÚ UNIDAD 1 ===")
        println("1. ej4")
        println("2. ej6")
        println("3. ej12")
        println("4. ej15")
        println("5. ej18")
        println("6. ej20")
        println("7. ej21")
        println("8. ej22")
        println("9. ej24")
        println("10. ej25")
        println("11. ej26")
        println("12. ej27")
        println("X. VOLVER")
        print("Selecciona un ejercicio: ")

        when (readLine()?.trim()?.uppercase()) {
            "1" -> ejecutarEjercicio("unidad_1.ejercicios_basicos.ej4")
            "2" -> ejecutarEjercicio("unidad_1.ejercicios_basicos.ej6")
            "3" -> ejecutarEjercicio("unidad_1.ejercicios_basicos.ej12")
            "4" -> ejecutarEjercicio("unidad_1.ejercicios_basicos.ej15")
            "5" -> ejecutarEjercicio("unidad_1.ejercicios_basicos.ej18")
            "6" -> ejecutarEjercicio("unidad_1.ejercicios_basicos.ej20")
            "7" -> ejecutarEjercicio("unidad_1.ejercicios_basicos.ej21")
            "8" -> ejecutarEjercicio("unidad_1.ejercicios_basicos.ej22")
            "9" -> ejecutarEjercicio("unidad_1.ejercicios_basicos.ej24")
            "10" -> ejecutarEjercicio("unidad_1.ejercicios_basicos.ej25")
            "11" -> ejecutarEjercicio("unidad_1.ejercicios_basicos.ej26")
            "12" -> ejecutarEjercicio("unidad_1.ejercicios_basicos.ej27")
            "X" -> return
            else -> println("Opción inválida, por favor intenta de nuevo.")
        }
    }
}

// Menú para la UNIDAD 2
fun mostrarMenuUnidad2() {
    while (true) {
        println("=== MENÚ UNIDAD 2 ===")
        println("1. captura_excepciones - ej2")
        println("2. captura_excepciones - ej3")
        println("3. captura_excepciones - ej4")
        println("4. sentencias_condicionales - ej2")
        println("5. sentencias_condicionales - ej3")
        println("6. sentencias_condicionales - ej6")
        println("7. sentencias_condicionales - ej8")
        println("8. sentencias_condicionales - ej10")
        println("9. sentencias_iterativas - ej2")
        println("10. sentencias_iterativas - ej4")
        println("11. sentencias_iterativas - ej6")
        println("12. sentencias_iterativas - ej13")
        println("13. sentencias_iterativas - ej15")
        println("14. sentencias_iterativas - ej18")
        println("15. sentencias_iterativas - ej19")
        println("16. sentencias_iterativas - ej25")
        println("X. VOLVER")
        print("Selecciona un ejercicio: ")

        when (readLine()?.trim()?.uppercase()) {
            "1" -> ejecutarEjercicio("unidad_2.captura_excepciones.ej2")
            "2" -> ejecutarEjercicio("unidad_2.captura_excepciones.ej3")
            "3" -> ejecutarEjercicio("unidad_2.captura_excepciones.ej4")
            "4" -> ejecutarEjercicio("unidad_2.sentencias_condicionales.ej2")
            "5" -> ejecutarEjercicio("unidad_2.sentencias_condicionales.ej3")
            "6" -> ejecutarEjercicio("unidad_2.sentencias_condicionales.ej6")
            "7" -> ejecutarEjercicio("unidad_2.sentencias_condicionales.ej8")
            "8" -> ejecutarEjercicio("unidad_2.sentencias_condicionales.ej10")
            "9" -> ejecutarEjercicio("unidad_2.sentencias_iterativas.ej2")
            "10" -> ejecutarEjercicio("unidad_2.sentencias_iterativas.ej4")
            "11" -> ejecutarEjercicio("unidad_2.sentencias_iterativas.ej6")
            "12" -> ejecutarEjercicio("unidad_2.sentencias_iterativas.ej13")
            "13" -> ejecutarEjercicio("unidad_2.sentencias_iterativas.ej15")
            "14" -> ejecutarEjercicio("unidad_2.sentencias_iterativas.ej18")
            "15" -> ejecutarEjercicio("unidad_2.sentencias_iterativas.ej19")
            "16" -> ejecutarEjercicio("unidad_2.sentencias_iterativas.ej25")
            "X" -> return
            else -> println("Opción inválida, por favor intenta de nuevo.")
        }
    }
}

// Menú para la UNIDAD 3
fun mostrarMenuUnidad3() {
    while (true) {
        println("=== MENÚ UNIDAD 3 ===")
        println("1. conjuntos - ej2")
        println("2. conjuntos - ej3")
        println("3. conjuntos - ej4")
        println("4. conjuntos - ej5")
        println("5. conjuntos - ej6")
        println("6. diccionarios - ej6")
        println("7. diccionarios - ej7")
        println("8. diccionarios - ej8")
        println("9. diccionarios - ej10")
        println("10. diccionarios - ej11")
        println("11. listas_tuplas - ej6")
        println("12. listas_tuplas - ej8")
        println("13. listas_tuplas - ej9")
        println("14. listas_tuplas - ej10")
        println("15. listas_tuplas - ej13")
        println("X. VOLVER")
        print("Selecciona un ejercicio: ")

        when (readLine()?.trim()?.uppercase()) {
            "1" -> ejecutarEjercicio("unidad_3.conjuntos.ej2")
            "2" -> ejecutarEjercicio("unidad_3.conjuntos.ej3")
            "3" -> ejecutarEjercicio("unidad_3.conjuntos.ej4")
            "4" -> ejecutarEjercicio("unidad_3.conjuntos.ej5")
            "5" -> ejecutarEjercicio("unidad_3.conjuntos.ej6")
            "6" -> ejecutarEjercicio("unidad_3.diccionarios.ej6")
            "7" -> ejecutarEjercicio("unidad_3.diccionarios.ej7")
            "8" -> ejecutarEjercicio("unidad_3.diccionarios.ej8")
            "9" -> ejecutarEjercicio("unidad_3.diccionarios.ej10")
            "10" -> ejecutarEjercicio("unidad_3.diccionarios.ej11")
            "11" -> ejecutarEjercicio("unidad_3.listas_tuplas.ej6")
            "12" -> ejecutarEjercicio("unidad_3.listas_tuplas.ej8")
            "13" -> ejecutarEjercicio("unidad_3.listas_tuplas.ej9")
            "14" -> ejecutarEjercicio("unidad_3.listas_tuplas.ej10")
            "15" -> ejecutarEjercicio("unidad_3.listas_tuplas.ej13")
            "X" -> return
            else -> println("Opción inválida, por favor intenta de nuevo.")
        }
    }
}

// Simula la ejecución del ejercicio
fun ejecutarEjercicio(ejercicio: String) {
    println("Ejecutando ejercicio: $ejercicio")
    println("=== Fin de la ejecución ===\n")
}