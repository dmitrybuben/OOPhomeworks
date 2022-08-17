package sem2hw;

public class Cat implements PetReachable {

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

}
