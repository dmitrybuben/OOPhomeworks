package sem2hw;

public class Dog implements AnimalAction {

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

}
