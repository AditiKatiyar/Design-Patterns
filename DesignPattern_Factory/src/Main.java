public class Main {
    public static void main(String[] args) {
        IAnimalFactory animalFactory = new BalancedAnimalFactory();
        System.out.println("Balanced Animal Factory");
        display(animalFactory);
        display(animalFactory);
        display(animalFactory);
        display(animalFactory);
        display(animalFactory);
        display(animalFactory);
        display(animalFactory);
        display(animalFactory);
        display(animalFactory);

        animalFactory = new RandomAnimalFactory();
        System.out.println("Random Animal Factory");
        display(animalFactory);
        display(animalFactory);
        display(animalFactory);
        display(animalFactory);
        display(animalFactory);
        display(animalFactory);
        display(animalFactory);
        display(animalFactory);
        display(animalFactory);
    }

    private static void display(IAnimalFactory animalFactory) {
        IAnimal animal = animalFactory.createAnimal();
        System.out.print("animal says: ");
        animal.displayAnimal();
    }
}
