/*concrete implementation of Quack behaviour*/
public class NoQuack implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I do not quack");
    }
}
