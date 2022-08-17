package sem3hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Semen", "B", 90);
        Person person1 = new Person("Valentina", "B", 65);
        Person person2 = new Person("Stanislav", "B", 63);
        Person person3 = new Person("Vladimir", "B", 64);
        Person person4 = new Person("Vladislava", "B", 60);
        Person person5 = new Person("Alexandra", "B", 62);
        Person person6 = new Person("Dmitry", "B", 45);

        Tree tree = new Tree();
        tree.addLink(person, person1, Relation.PARENT, Relation.CHILD);
        tree.addLink(person, person2, Relation.PARENT, Relation.CHILD);
        tree.addLink(person, person3, Relation.PARENT, Relation.CHILD);
        tree.addLink(person, person4, Relation.PARENT, Relation.CHILD);
        tree.addLink(person, person5, Relation.PARENT, Relation.CHILD);
        tree.addLink(person, person6, Relation.GRANDFATHER, Relation.GRANDSON);
        tree.addLink(person1, person4, Relation.SISTER, Relation.SISTER);
        tree.addLink(person2, person3, Relation.BROTHER, Relation.BROTHER);
        tree.addLink(person2, person1, Relation.BROTHER, Relation.SISTER);
        tree.addLink(person1, person6, Relation.AUNT, Relation.NEPHEW);
        tree.addLink(person3, person6, Relation.PARENT, Relation.CHILD);

//        Research.showResult("Vladimir", tree);
//        Research.showTree(tree);
//        Research.showResult(tree);

        List<Person> pl = new ArrayList<>();
        pl.add(person);
        pl.add(person1);
        pl.add(person2);
        pl.add(person3);
        pl.add(person4);
        pl.add(person5);
        pl.add(person6);

        // сортировка через Comparator по возрастанию возраста
        pl.sort(new AgeSorter());
        for (Person p : pl) {
            System.out.println(p);
        }
        System.out.println("-------------");

        // по убыванию возраста
        pl.sort(new AgeReverseSorter());
        for (Person p : pl) {
            System.out.println(p);
        }
        System.out.println("-------------");

        // через анономный класс по имени по убыванию
        pl.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return (o2.getName().compareTo(o1.getName()));
            }
        });
        for (Person p : pl) {
            System.out.println(p);
        }
        System.out.println("-------------");

        // лямбда по возрастанию имен
        pl.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        for (Person p : pl) {
            System.out.println(p);
        }
        System.out.println("-------------");

        // предложена замена идеей лямбды другой лямбдой )
        pl.sort(Comparator.comparing(Person::getName));
        for (Person p : pl) {
            System.out.println(p);
        }
        System.out.println("-------------");

        // через имплементацию интерфейса Comparable
        Collections.sort(pl);
        for (Person p : pl) {
            System.out.println(p);
        }
    }
}
