package lambdaExpression.methodReferenceExample;

import lambdaExpression.lambdaExeciseYouTube.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens",28),
                new Person("Lewis","Carroll",25),
                new Person("David","Pearson",38),
                new Person("Catherine","Coolest",38),
                new Person("Mathew","Arnold",18)

        );
/**
    here is a second example where you have one input argument and you are calling a method with that same argument
    right so again this is being a pass through you saying take this value then pass it to system there
    out dot println right this is another example where we can replace this with method references
*/

        System.out.println("Print all person");
        performConditionally(people,p -> true,p -> System.out.println(p));

 /**
         in order to replace this with a method reference you're going to have to take the instance and then double colon and then
         the method name let me actually do that here I'm going to take this out and then I'm going to do a system dot out which
         is basically the instance on which the println method has been called double colon and then the method name which is
         println now this is again a shorthand for the Java compiler to say okay I'm taking an input argument and then
         passing it in
*/

        System.out.println("Print all person with method reference");
        performConditionally(people,p -> true,System.out::println); // p -> method(p)


    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {

        for (Person p: people){
            if (predicate.test(p)){
                consumer.accept(p);
            }
        }

    }
}
