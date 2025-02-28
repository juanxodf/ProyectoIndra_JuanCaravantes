import Clases.*

fun main() {
    val gestionEventos = GestionEventos()

    val conferencia = Evento("Conferencia sobre Energías Renovables", "20/03/2025", "2 horas", "Centro de Convenciones")
    val taller = Taller("Taller de Reciclaje Creativo", "25/03/2025", "3 horas", "Centro Cultural", "Materiales reciclados")
    val actividad = ActividadEcologica("Actividad Ecológica en el Parque", "30/03/2025", "4 horas", "Parque Natural", "Plantación de árboles")

    gestionEventos.agregarEvento(conferencia)
    gestionEventos.agregarEvento(taller)
    gestionEventos.agregarEvento(actividad)

    var seguir = true
    while (seguir) {
        println("\nOpciones:")
        println("1. Mostrar eventos")
        println("2. Mostrar detalles de un evento")
        println("3. Registrar participante en un evento")
        println("4. Salir")
        print("Selecciona una opción: ")
        val opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> gestionEventos.mostrarEventos()
            2 -> {
                print("Introduce el nombre del evento: ")
                val nombreEvento = readLine() ?: ""
                gestionEventos.mostrarDetallesEspecifico(nombreEvento)
            }
            3 -> {
                print("Introduce el nombre del evento: ")
                val nombreEvento = readLine() ?: ""
                gestionEventos.registrarParticipanteEnEvento(nombreEvento)
            }
            4 -> seguir = false
            else -> println("Opción no válida.")
        }
    }
}
