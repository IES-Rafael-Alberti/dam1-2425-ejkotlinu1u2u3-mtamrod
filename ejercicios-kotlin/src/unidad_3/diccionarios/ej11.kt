package unidad_3.diccionarios

fun ej11() {
    val directorioClientes = """
        nif;nombre;email;teléfono;descuento
        01234567L;Luis González;luisgonzalez@mail.com;656343576;12.5
        71476342J;Macarena Ramírez;macarena@mail.com;692839321;8
        63823376M;Juan José Martínez;juanjo@mail.com;664888233;5.2
        98376547F;Carmen Sánchez;carmen@mail.com;667677855;15.7
    """.trimIndent()

    val lineas = directorioClientes.split("\n")
    val encabezados = lineas.first().split(";")

    val clientes = lineas.drop(1).map { linea ->
        val datos = linea.split(";")
        encabezados.zip(datos).toMap()
    }

    println("Información de los clientes:")
    clientes.forEach { cliente ->
        println(cliente)
    }
}