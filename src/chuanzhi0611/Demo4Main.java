package chuanzhi0611;

import java.util.Arrays;
import java.util.Comparator;

public class Demo4Main {
    public static void main(String[] args) {

        Person[] ps = {
                new Person("a", 20),
                new Person("b", 23),
                new Person("c", 22),
                new Person("d", 30)
        };
       /* Arrays.sort(ps, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/

        Arrays.sort(ps, (Person p1, Person p2) -> {
            return p1.getAge() - p2.getAge();
        });

        for (Person p : ps) {
            System.out.println(p);
        }

    }
}
