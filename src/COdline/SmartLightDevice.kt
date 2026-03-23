class SmartLightDevice(deviceName: String) :
    SmartDevice(deviceName, "Utilidad") {

    override val deviceType = "Lámpara Inteligente"

    var brightnessLevel = 0
        set(value) {
            if (value in 0..100) field = value
        }

    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        deviceTurnOnCount++
        println("$name encendida. El nivel de brillo es $brightnessLevel.")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("$name ha sido apagada.")
    }

    fun increaseBrightness() {
        brightnessLevel++
        println("Brillo aumentado a $brightnessLevel.")
    }

    fun decreaseBrightness() {
        brightnessLevel--
        println("Brillo disminuido a $brightnessLevel.")
    }
}