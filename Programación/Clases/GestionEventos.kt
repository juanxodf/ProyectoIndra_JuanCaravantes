package Clases

class GestionEventos {
    private val eventos = mutableListOf<Evento>()

    fun agregarEvento(evento: Evento) {
        eventos.add(evento)
    }

    fun mostrarEventos() {
        println("Listado de eventos:")
        eventos.forEach { evento ->
            println("- ${evento.nombre} (${evento.fecha})")
        }
    }

    fun mostrarDetallesEvento(nombre: String) {
        val evento = eventos.find { it.nombre == nombre }
        if (evento != null) {
            evento.mostrarDetalles()
        } else {
            println("Evento no encontrado.")
        }
    }

    fun mostrarDetallesEspecifico(nombre: String) {
        val evento = eventos.find { it.nombre == nombre }
        when (evento) {
            is Taller -> evento.mostrarDetallesTaller()
            is ActividadEcologica -> evento.mostrarDetallesActividad()
            else -> evento?.mostrarDetalles()
        }
    }

    fun registrarParticipanteEnEvento(nombreEvento: String) {
        val evento = eventos.find { it.nombre == nombreEvento }
        if (evento != null) {
            print("Introduce el nombre del participante: ")
            val participante = readLine() ?: ""
            evento.agregarParticipante(participante)
        } else {
            println("Evento no encontrado.")
        }
    }
}
