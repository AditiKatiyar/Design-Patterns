package background

import Constants

class LightBackground: IBackground {
    override fun getBackground(): String {
        return Constants().LIGHT_BACKGROUND
    }
}