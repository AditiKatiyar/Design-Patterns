class RandomAnimalFactory: IAnimalFactory {
    override fun createAnimal(): IAnimal {
        val list = listOf(0, 1, 2)
        val n = list.random()
        when (n) {
            0 -> return Dog()
            1 -> return Cat()
            2 -> return Duck()
        }
        return Dog()
    }
}