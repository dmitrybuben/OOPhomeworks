package sem2.task;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Toop-Toop");
    }

    @Override
    public void sound() {
        System.out.println("Gav!Gav!");
    }

    @Override
    public void eat() {
        System.out.println("Aaam!");
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }
}
