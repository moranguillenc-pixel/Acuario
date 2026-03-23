package refugio

class Perro(nombre: String) : Animal(nombre), AccionAnimal {
    override val tipo = "perro"
    override val sonido = "Guau"

    override fun hacerSonido() {
        println("$nombre dice: $sonido!")
    }
}

class Gato(nombre: String) : Animal(nombre), AccionAnimal {
    override val tipo = "gato"
    override val sonido = "Miau"

    override fun hacerSonido() {
        println("$nombre dice: $sonido~")
    }

    override fun dormir() {
        println("$nombre duerme enroscado 🐱")
    }
}