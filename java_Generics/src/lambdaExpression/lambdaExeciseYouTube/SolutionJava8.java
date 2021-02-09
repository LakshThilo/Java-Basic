package lambdaExpression.lambdaExeciseYouTube;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SolutionJava8 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
          new Person("Charles","Dickens",28),
          new Person("Lewis","Carroll",25),
          new Person("David","Pearson",38),
          new Person("Catherine","Coolest",38),
          new Person("Mathew","Arnold",18),
          new Person("Carly","Arnold",18)

        );

        /** ===========================  Using java 7 =================================== */
        // step 1: sort list by last name
    /*
         Basic ways
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getLastName().compareTo(p2.getLastName());
            }
        });*/

        Collections.sort(people,(o1,o2) ->o1.getLastName().compareTo(o2.getLastName()) );

        // step 2: Create a method that print all element in the list
       /* printAll(people);*/
        printConditionally(people,p -> true);


        // step 3: Create a method that print all people that have last name bedinning with C
        System.out.println("Print all person's name last start with 'C'====================================");
        printConditionally(people, p -> p.getLastName().startsWith("C"));

        System.out.println("Print all person's  first start with 'C'====================================");
        printConditionally(people, p -> p.getFirstName().startsWith("C"));

    }

    private static void printConditionally(List<Person> people, Condition condition) {

        for (Person p: people){
            if (condition.test(p)){
                System.out.println(p);
            }
        }
    }

/**  We can get ride of this method and use conditionally method to print all list
 * just need to do is pass condition as true*/
/*
    private static void printAll(List<Person> people) {
        for(Person p:people){
            System.out.println(p);
        }

    }*/
}
    interface Conditionally{

    boolean condition(Person p);
        }
