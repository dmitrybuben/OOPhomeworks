package sem2hw;

public class Man extends Person {

    public Man(String name, String surname, int age, PetReachable petReachable) {
        super(name, surname, age, petReachable);
    }
    public void callAnimal(){
        petReachable.move();
    }
    public void feedAnimal(){
        petReachable.eat();
    }
}
