package text

import Constants

class LightText: IText {
    override fun getText(): String {
        return Constants().LIGHT_TEXT
    }
}