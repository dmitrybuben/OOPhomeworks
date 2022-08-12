package sem2.task;

public class Man extends People {

    public Man(String name) {
        super(name);
    }

    @Override
    public void call(Animal animal) {
        if(animal instanceof Cat){
            animal.move();
        } else if (animal instanceof Dog) {
            animal.run();
        }
    }

    @Override
    public void feed(Animal animal) {
        if(animal instanceof Cat){
            animal.eat();
        } else if (animal instanceof Dog) {
            animal.sound();
        }
    }

    @Override
    public void whisle(Animal animal) {
        if(animal instanceof Cat) {
            animal.run();
        } else if (animal instanceof Dog) {
            animal.run();
        }
    }
}
