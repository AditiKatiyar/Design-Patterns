/*concrete class of a type of duck*/
public class CityDuck extends Duck {
    CityDuck() {
        /*injecting the behaviours dynamically when the object of CityDuck will be created*/
        super(new JetFly(), new NoQuack());
    }

    /*implements the abstract method since CityDuck is a concrete class*/
    @Override
    void display() {
        System.out.println("I am a city duck");
    }
}
