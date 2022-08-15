package sem2hw;

public class Man extends People{

    public Man(String name, String surname, int age, AnimalAction animalAction) {
        super(name, surname, age, animalAction);
    }
    public void callAnimal(){
        animalAction.move();
    }
    public void feedAnimal(){
        animalAction.eat();
    }
}
