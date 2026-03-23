fun main() {
    val smartHome = SmartHome(
        SmartTvDevice("Android TV"),
        SmartLightDevice("Lámpara Inteligente")
    )

    println("=== Encendiendo dispositivos ===")
    smartHome.turnOnTv()
    smartHome.turnOnLight()

    println("\n=== Controlando la TV ===")
    smartHome.increaseTvVolume()
    smartHome.decreaseTvVolume()
    smartHome.changeTvChannel()
    smartHome.changeTvChannelToPrevious()

    println("\n=== Controlando la luz ===")
    smartHome.increaseLightBrightness()
    smartHome.decreaseLightBrightness()
    println("\n=== Información de dispositivos ===")
    smartHome.printSmartTvInfo()
    smartHome.printSmartLightInfo()

    println("\nTotal de veces encendido: ${smartHome.deviceTurnOnCount}")

    println("\n=== Prueba: acción sin encender ===")
    smartHome.turnOffAllDevices()
    smartHome.increaseTvVolume()

    println("\n=== Apagando todo ===")
    smartHome.turnOffAllDevices()
}