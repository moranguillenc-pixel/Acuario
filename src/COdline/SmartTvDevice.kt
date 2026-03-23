class SmartTvDevice(deviceName: String) :
    SmartDevice(deviceName, "Entretenimiento") {

    override val deviceType = "Smart TV"

    var speakerVolume = 2
        set(value) {
            if (value in 0..100) field = value
        }

    var channelNumber = 1
        set(value) {
            if (value in 0..200) field = value
        }

    override fun turnOn() {
        super.turnOn()
        deviceTurnOnCount++
        println(
            "$name está encendido. " +
                    "El volumen es $speakerVolume y el canal es $channelNumber."
        )
    }

    override fun turnOff() {
        super.turnOff()
        println("$name ha sido apagado.")
    }

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Volumen aumentado a $speakerVolume.")
    }

    fun decreaseVolume() {
        speakerVolume--
        println("Volumen disminuido a $speakerVolume.")
    }

    fun nextChannel() {
        channelNumber++
        println("Canal cambiado al $channelNumber.")
    }

    fun previousChannel() {
        channelNumber--
        println("Canal anterior: $channelNumber.")
    }
}