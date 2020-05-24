package factory

import background.IBackground
import background.LightBackground
import text.IText
import text.LightText

class LightThemeFactory: IThemeAbstractFactory {
    override fun getTextProduct(): IText {
        return LightText()
    }

    override fun getBackgroundProduct(): IBackground {
        return LightBackground()
    }
}