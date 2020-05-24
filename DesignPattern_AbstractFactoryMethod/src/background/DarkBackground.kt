package background

import Constants

class DarkBackground: IBackground {
    override fun getBackground(): String {
        return Constants().DARK_BACKGROUND
    }
}