package lambdaExpression.collectionIterator;

import java.util.Arrays;
import java.util.List;

public class CollectionIteratorExample {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens",28),
                new Person("Lewis","Carroll",25),
                new Person("David","Pearson",38),
                new Person("Catherine","Coolest",38)
                );

        System.out.println("Using for loop");
        for(int i =0; i < people.size(); i++){
            System.out.println(people.get(i));

        }
        System.out.println("");
        System.out.println("Using for loop");
        for(Person p : people){
            System.out.println(p);
        }

        System.out.println("");
        System.out.println("Using lambda for each loop and consumer Interface");
        people.forEach((p) -> System.out.println(p) );

        System.out.println("");
        System.out.println("Using method reference");
        people.forEach(System.out::println);
    }
}
