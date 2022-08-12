package sem2.task;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract void move();
    public abstract void sound();
    public abstract void eat();
    public abstract void run();
}
