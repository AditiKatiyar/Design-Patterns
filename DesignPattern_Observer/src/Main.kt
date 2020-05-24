
fun main(args: Array<String>) {
    val weatherStation = WeatherStation()
    val phoneDisplay = PhoneDisplay(weatherStation)
    weatherStation.add(phoneDisplay)

    weatherStation.changeTemperature(10)
    weatherStation.changeTemperature(20)
    weatherStation.changeTemperature(30)

    weatherStation.remove(phoneDisplay)

    weatherStation.changeTemperature(40)
    weatherStation.changeTemperature(50)
    weatherStation.changeTemperature(60)

    weatherStation.add(phoneDisplay)

    weatherStation.changeTemperature(70)
    weatherStation.changeTemperature(80)
    weatherStation.changeTemperature(90)
}