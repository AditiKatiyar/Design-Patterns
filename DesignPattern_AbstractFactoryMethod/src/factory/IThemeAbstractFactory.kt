package factory

import background.IBackground
import text.IText

interface IThemeAbstractFactory {
    fun getTextProduct(): IText
    fun getBackgroundProduct(): IBackground
}