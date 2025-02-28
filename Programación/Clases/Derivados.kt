package Clases

class Taller : Evento {
    var material: String

    constructor(nombre: String, fecha: String, duracion: String, ubicacion: String, material: String) : super(nombre, fecha, duracion, ubicacion) {
        this.material = material
    }

    fun mostrarMaterial() {
        println("Material necesario para el taller $nombre: $material")
    }

    fun mostrarDetallesTaller() {
        mostrarDetalles()
        mostrarMaterial()
    }
}

class ActividadEcologica : Evento {
    var actividad: String

    constructor(nombre: String, fecha: String, duracion: String, ubicacion: String, actividad: String) : super(nombre, fecha, duracion, ubicacion) {
        this.actividad = actividad
    }

    fun mostrarActividad() {
        println("Actividad a realizar en el evento $nombre: $actividad")
    }

    fun mostrarDetallesActividad() {
        mostrarDetalles()
        mostrarActividad()
    }
}
