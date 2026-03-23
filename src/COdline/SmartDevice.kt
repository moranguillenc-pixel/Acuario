open class SmartDevice(val name: String, val category: String) {

    var deviceStatus = "en línea"
        protected set

    open val deviceType = "dispositivo desconocido"

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0    -> "sin conexión"
            1    -> "en línea"
            else -> "desconocido"
        }
    }

    open var deviceTurnOnCount = 0
        protected set

    open fun turnOn() {
        deviceStatus = "encendido"
    }

    open fun turnOff() {
        deviceStatus = "apagado"
    }

    fun printDeviceInfo() {
        println("Nombre: $name | Categoría: $category | Tipo: $deviceType")
    }
}