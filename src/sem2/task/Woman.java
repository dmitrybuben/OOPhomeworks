package sem2.task;

public class Woman extends People {
    public Woman(String name) {
        super(name);
    }

    @Override
    public void call(Animal animal) {
        if (animal instanceof Cat) {
            animal.sound();
        } else if (animal instanceof Dog) {
            animal.sound();
        }
    }

    @Override
    public void feed(Animal animal) {
        if(animal instanceof Cat) {
            animal.run();
        } else if (animal instanceof Dog) {
            animal.move();
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
