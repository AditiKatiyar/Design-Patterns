import factory.DarkThemeFactory
import factory.IThemeAbstractFactory
import factory.LightThemeFactory

class FactoryProducer {
    fun getThemeFactory(theme: String): IThemeAbstractFactory {
        if (theme == "light"){
            return LightThemeFactory()
        } else {
            return DarkThemeFactory()
        }
    }
}