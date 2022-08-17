package sem3hw;

import java.util.Comparator;

public class AgeReverseSorter implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o2.getAge(), o1.getAge());
    }
}
