package sem2hw;

public class Hamster implements AnimalAction{
    @Override
    public void move() {
        System.out.println("tic-tic");
    }

    @Override
    public void sound() {
        System.out.println("piiii-piii");
    }

    @Override
    public void eat() {
        System.out.println("hrrrruum");
    }
}
