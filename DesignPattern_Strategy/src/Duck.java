/*abstract class for Duck*/
public abstract class Duck {
    private IFlyBehaviour flyBehaviour;
    private IQuackBehaviour quackBehaviour;

    Duck(){ }

    Duck(IFlyBehaviour flyBehaviour, IQuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    abstract void display();

    void setFlyBehaviour(IFlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    void setQuackBehaviour(IQuackBehaviour quackBehaviour){
        this.quackBehaviour = quackBehaviour;
    }

    void performFly() {
        flyBehaviour.fly();
    }

    void performQuack() {
        quackBehaviour.quack();
    }
}
