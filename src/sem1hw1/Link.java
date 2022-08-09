package sem1hw1;

public class Link {
    private Person firstPerson;
    private Person secondPerson;
    private Relation link;

    public Person getFirstPerson() {
        return firstPerson;
    }

    public Person getSecondPerson() {
        return secondPerson;
    }

    public Relation getLink() {
        return link;
    }

    public Link(Person firstPerson, Person secondPerson, Relation link) {
        this.firstPerson = firstPerson;
        this.secondPerson = secondPerson;
        this.link = link;
    }

    @Override
    public String toString() {
        return "Links{" +
                "firstPerson=" + firstPerson +
                ", secondPerson=" + secondPerson +
                ", link=" + link +
                '}';
    }
}
