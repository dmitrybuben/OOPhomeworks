package sem2hw;

public abstract class People {
    protected String name;
    protected String surname;
    protected int age;
    protected AnimalAction animalAction;

    public People(String name, String surname, int age, AnimalAction animalAction) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.animalAction = animalAction;
    }
}
