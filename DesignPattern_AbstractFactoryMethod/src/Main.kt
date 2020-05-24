import factory.IThemeAbstractFactory

fun main(args: Array<String>) {
    val lightThemeFactory = FactoryProducer().getThemeFactory("light")
    handleTheme(lightThemeFactory)

    val darkThemeFactory = FactoryProducer().getThemeFactory("dark")
    handleTheme(darkThemeFactory)
}

private fun handleTheme(theme: IThemeAbstractFactory) {
    println(theme.getTextProduct().getText())
    println(theme.getBackgroundProduct().getBackground())
}