package lambdaExpression.lambdaExeciseYouTube;

import java.util.*;


public class SolutionJava7 {

    public static void main(String[] args) {


        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens",28),
                new Person("Lewis","Carroll",25),
                new Person("David","Pearson",38),
                new Person("Mathew","Callous",18)

        );

        /** ===========================  Using java 7 ======================================== */

        /** step 1: sort list by last name*/
        /*this people list contain the shorted list after running the method */
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        /**step 2: Create a method that print all element in the list*/
        System.out.println("Print sorted list: =========================================");
         printAll(people);

        /** step 3: Create a method that print all people that have last name beginning with C*/
       // printLastNameBeginningWithC(people);


        // solution for the above
        System.out.println("Last name start with 'C': ======================================== ");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });



        System.out.println("First name start with 'C': ======================================= ");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("C");
            }
        });
    }





/*   This is very inflexible if wanna print people with last name beginning with D that means you have
     crate a another method so this is not ideal so what we'd like ti do is have a behavior pass into that method */
    private static void printLastNameBeginningWithC(List<Person> people) {

        System.out.println("==================================");

            for( Person p : people){
                if(p.getLastName().startsWith("C")) {
                    System.out.println(p);

                }
            }

    }

    // solution for the above problem can fix like this

    private  static void printConditionally(List<Person> people, Condition condition){
        for(Person p: people) {
            if (condition.test(p)){
                System.out.println(p);
            }
        }

    }



     private static void printAll(List<Person> people) {
        for(Person p:people){

            System.out.println(p);
        }

    }
}
/*    This is basically looking at method which at a person and says whether that person should be included or not
       for something like know printing the last name beginning */
interface Condition{

    boolean test(Person p);
}