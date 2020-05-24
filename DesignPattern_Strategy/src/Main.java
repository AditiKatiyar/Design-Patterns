public class Main {
    public static void main(String[] args) {
        System.out.println("WildDuck behaviours :");
        WildDuck wildDuck = new WildDuck();
        wildDuck.performFly();
        wildDuck.performQuack();

        System.out.println("\nCityDuck behaviours :");
        CityDuck cityDuck = new CityDuck();
        cityDuck.performFly();
        cityDuck.performQuack();

        /*We can also change the behaviour dynamically according to our need*/
        cityDuck.setQuackBehaviour(new SimpleQuack());
        System.out.println("\nCity duck now has new quack behaviour");
        cityDuck.performQuack();
    }
}
