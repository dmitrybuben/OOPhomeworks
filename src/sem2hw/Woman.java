package sem2hw;

public class Woman extends Person {

    public Woman(String name, String surname, int age, PetReachable petReachable) {
        super(name, surname, age, petReachable);
    }
    public void callAnimal(){
        petReachable.sound();
    }
}
