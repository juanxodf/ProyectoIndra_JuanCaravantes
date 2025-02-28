package Clases

open class Evento(var nombre: String, var fecha: String, var duracion: String, var ubicacion: String) {
    private val participantes = mutableListOf<String>()

    fun agregarParticipante(participante: String) {
        if (participantes.contains(participante)) {
            println("$participante ya está registrado en el evento $nombre")
        } else {
            participantes.add(participante)
            println("$participante se ha registrado en el evento $nombre")
        }
    }

    fun mostrarParticipantes() {
        println("Participantes en el evento $nombre:")
        participantes.forEach { println("- $it") }
    }

    fun mostrarDetalles() {
        println("Detalles del evento $nombre:")
        println("Fecha: $fecha")
        println("Duración: $duracion")
        println("Ubicación: $ubicacion")
        println("Participantes: ${participantes.size}")
    }
}
