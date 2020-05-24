package factory

import background.DarkBackground
import background.IBackground
import text.DarkText
import text.IText

class DarkThemeFactory: IThemeAbstractFactory {
    override fun getTextProduct(): IText {
        return DarkText()
    }

    override fun getBackgroundProduct(): IBackground {
        return DarkBackground()
    }
}