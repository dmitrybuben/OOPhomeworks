package sem2.task;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Top-top");
    }

    @Override
    public void sound() {
        System.out.println("May!");
    }

    @Override
    public void eat() {
        System.out.println("Hrum-Hrum");
    }

    @Override
    public void run() {
        System.out.println("I can't here you!");
    }

}
