package sem2hw;

public class Woman extends People {

    public Woman(String name, String surname, int age, AnimalAction animalAction) {
        super(name, surname, age, animalAction);
    }
    public void callAnimal(){
        animalAction.sound();
    }
}
