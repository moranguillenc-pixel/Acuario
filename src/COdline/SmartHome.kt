class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice
) {
    var deviceTurnOnCount = 0
        private set

    fun turnOnTv() {
        if (smartTvDevice.deviceStatus == "encendido") {
            println("${smartTvDevice.name} ya está encendido.")
        } else {
            smartTvDevice.turnOn()
            deviceTurnOnCount++
        }
    }

    fun turnOffTv() {
        if (smartTvDevice.deviceStatus == "encendido") {
            smartTvDevice.turnOff()
        } else {
            println("${smartTvDevice.name} ya está apagado.")
        }
    }

    fun increaseTvVolume() {
        if (smartTvDevice.deviceStatus == "encendido") {
            smartTvDevice.increaseSpeakerVolume()
        } else {
            println("Enciende ${smartTvDevice.name} primero.")
        }
    }

    fun decreaseTvVolume() {
        if (smartTvDevice.deviceStatus == "encendido") {
            smartTvDevice.decreaseVolume()
        } else {
            println("Enciende ${smartTvDevice.name} primero.")
        }
    }

    fun changeTvChannel() {
        if (smartTvDevice.deviceStatus == "encendido") {
            smartTvDevice.nextChannel()
        } else {
            println("Enciende ${smartTvDevice.name} primero.")
        }
    }

    fun changeTvChannelToPrevious() {
        if (smartTvDevice.deviceStatus == "encendido") {
            smartTvDevice.previousChannel()
        } else {
            println("Enciende ${smartTvDevice.name} primero.")
        }
    }

    fun printSmartTvInfo() = smartTvDevice.printDeviceInfo()

    fun turnOnLight() {
        if (smartLightDevice.deviceStatus == "encendido") {
            println("${smartLightDevice.name} ya está encendida.")
        } else {
            smartLightDevice.turnOn()
            deviceTurnOnCount++
        }
    }

    fun turnOffLight() {
        if (smartLightDevice.deviceStatus == "encendido") {
            smartLightDevice.turnOff()
        } else {
            println("${smartLightDevice.name} ya está apagada.")
        }
    }

    fun increaseLightBrightness() {
        if (smartLightDevice.deviceStatus == "encendido") {
            smartLightDevice.increaseBrightness()
        } else {
            println("Enciende ${smartLightDevice.name} primero.")
        }
    }

    fun decreaseLightBrightness() {
        if (smartLightDevice.deviceStatus == "encendido") {
            smartLightDevice.decreaseBrightness()
        } else {
            println("Enciende ${smartLightDevice.name} primero.")
        }
    }

    fun printSmartLightInfo() = smartLightDevice.printDeviceInfo()
    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }
}