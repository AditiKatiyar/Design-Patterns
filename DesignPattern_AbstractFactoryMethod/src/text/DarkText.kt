package text

import Constants

class DarkText: IText {
    override fun getText(): String {
        return Constants().DARK_TEXT
    }
}