package sem1hw1;

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
        tree.addLink(person,person1,Relation.PARENT,Relation.CHILD);
        tree.addLink(person,person2,Relation.PARENT,Relation.CHILD);
        tree.addLink(person,person3,Relation.PARENT,Relation.CHILD);
        tree.addLink(person,person4,Relation.PARENT,Relation.CHILD);
        tree.addLink(person,person5,Relation.PARENT,Relation.CHILD);
        tree.addLink(person,person6,Relation.GRANDFATHER,Relation.GRANDSON);
        tree.addLink(person1,person4,Relation.SISTER,Relation.SISTER);
        tree.addLink(person2,person3,Relation.BROTHER,Relation.BROTHER);
        tree.addLink(person2,person1,Relation.BROTHER,Relation.SISTER);
        tree.addLink(person1,person6,Relation.AUNT,Relation.NEPHEW);
        tree.addLink(person3,person6,Relation.PARENT,Relation.CHILD);

        Research.showResult("Vladimir", tree);
        Research.showTree(tree);
        Research.showResult(tree);
    }
}
