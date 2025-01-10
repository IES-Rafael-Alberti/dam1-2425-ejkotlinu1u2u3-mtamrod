package unidad_2.sentencias_condicionales

fun ej2() {
    val contraseñaGuardada = "contraseña"
    println("Introduce la contraseña:")
    val contraseñaUsuario = readLine()

    if (contraseñaGuardada.equals(contraseñaUsuario, ignoreCase = true)) {
        println("La contraseña coincide")
    } else {
        println("La contraseña no coincide")
    }
}