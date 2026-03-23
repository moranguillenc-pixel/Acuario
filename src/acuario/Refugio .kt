package refugio

open class Refugio(
    var nombre: String,
    var capacidadMaxima: Int = 20
) {
    val animales = mutableListOf<Animal>()

    init {
        println("=== Refugio '$nombre' creado ===")
        println("Capacidad máxima: $capacidadMaxima animales")
    }

    val espacioDisponible: Int
        get() = capacidadMaxima - animales.size

    var director: String = "Sin asignar"
        set(valor) {
            field = if (valor.isNotBlank()) valor else "Sin asignar"
            println("Director actualizado: $field")
        }

    fun agregarAnimal(animal: Animal) {
        if (animales.size < capacidadMaxima) {
            animales.add(animal)
            println("✔ ${animal.nombre} agregado al refugio")
        } else {
            println("✘ Refugio lleno, no se puede agregar a ${animal.nombre}")
        }
    }

    fun listarAnimales() {
        println("\n--- Animales en $nombre ---")
        animales.forEach { it.presentarse() }
    }
}

class RefugioVIP(nombre: String) : Refugio(nombre, capacidadMaxima = 5) {
    override fun toString(): String {
        return "Refugio VIP '$nombre' | Ocupación: ${animales.size}/$capacidadMaxima"
    }
}