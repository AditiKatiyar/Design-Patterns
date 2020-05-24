class BalancedAnimalFactory: IAnimalFactory {
    companion object {
        var ANIMAL_HASH = 0
    }
    override fun createAnimal(): IAnimal {
        if (ANIMAL_HASH == 0) {
            ANIMAL_HASH = 1
            return Dog()
        } else if (ANIMAL_HASH == 1) {
            ANIMAL_HASH = 2
            return Cat()
        } else {
            ANIMAL_HASH = 0
            return Duck()
        }
    }
}