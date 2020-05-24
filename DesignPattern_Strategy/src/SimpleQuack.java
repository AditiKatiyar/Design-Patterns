/*concrete implementation of Quack behaviour*/
public class SimpleQuack implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I have simple quack behaviour");
    }
}
