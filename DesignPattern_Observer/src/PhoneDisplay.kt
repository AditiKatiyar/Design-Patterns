class PhoneDisplay(private val observable: WeatherStation): IObserver {
    override fun update() {
         // get temperature from the observable
        val observedTemperture = observable.getTemperature()
        println("phone display : $observedTemperture")
    }
}