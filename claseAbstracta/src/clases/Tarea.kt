package clases

class Tarea(var nombre: String, var estado: EstadoTarea) {
}

enum class EstadoTarea {
    PENDIENTE,
    EN_PROGRESO,
    COMPLETADA
}
