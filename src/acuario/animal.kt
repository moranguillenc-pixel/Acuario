package refugio

interface AccionAnimal {
    fun hacerSonido()
    fun dormir() {
        println("Zzz... durmiendo")   // método con implementación por defecto
    }
}

abstract class Animal(val nombre: String) {
    abstract val tipo: String
    abstract val sonido: String

    fun presentarse() {
        println("Hola, soy $nombre y soy un $tipo")
    }
}