package sem2.task;

public class App {
    public static void main(String[] args) {
        Man man = new Man("Dmitry");
        Woman woman = new Woman("Liudmila");
        Cat cat = new Cat("Bars");
        Dog dog = new Dog("Wolf");
        man.call(cat);
        man.call(dog);
        woman.call(cat);
        woman.call(dog);
        man.feed(cat);
        man.feed(dog);
        woman.feed(cat);
        woman.feed(dog);
        man.whisle(cat);
        man.whisle(dog);
        woman.whisle(cat);
        woman.whisle(dog);
    }
}
