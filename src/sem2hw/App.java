package sem2hw;

import sem2.task.Animal;

public class App {
    public static void main(String[] args) {
        Man man = new Man("Dmitry","B",35, new Cat());
        Woman woman = new Woman("Liudmila","B",35, new Dog());
        Man man1 = new Man("Dmitry","B",35, new Hamster());
        man.callAnimal();
        woman.callAnimal();
        man1.feedAnimal();
    }
}
