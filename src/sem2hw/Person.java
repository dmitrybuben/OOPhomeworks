package sem2hw;

public abstract class Person {
    protected String name;
    protected String surname;
    protected int age;
    protected PetReachable petReachable;

    public Person(String name, String surname, int age, PetReachable petReachable) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.petReachable = petReachable;
    }
}
