class WeatherStation: IObservable {

    private var observers: ArrayList<IObserver> = ArrayList()
    private var temperature = 0

    // add observer
    override fun add(observer: IObserver) {
        observers.add(observer)
    }

    // remove observer
    override fun remove(observer: IObserver) {
        observers.remove(observer)
    }

    // notify observers that observable has changed
    override fun notifyObservers() {
        observers.forEach { observer ->
            observer.update()
        }
    }

    // when the observer is notified, it is updated. The observer requests for the state of observable
    fun getTemperature(): Int {
        return temperature
    }

    // helper function to change the state of observable
    fun changeTemperature(t : Int) {
        temperature = t
        notifyObservers()
    }
}