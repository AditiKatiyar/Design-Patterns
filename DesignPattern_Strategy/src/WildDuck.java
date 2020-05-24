/*concrete class of a type of duck*/
public class WildDuck extends Duck {
    WildDuck() {
        /*injecting the behaviours dynamically when the object of CityDuck will be created*/
        super(new SimpleFly() , new SimpleQuack());
    }

    /*implements the abstract method since WildDuck is a concrete class*/
    @Override
    void display() {
        System.out.println("I am a wild duck");
    }
}
