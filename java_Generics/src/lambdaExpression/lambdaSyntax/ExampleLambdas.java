package lambdaExpression.lambdaSyntax;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class ExampleLambdas {

    public static void main(String[] args) {

        // method implementation with normal
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("run-1 ");

            }
        };

        // implementation of run method with lambda expression
        Runnable r2 = () -> System.out.println("run-2");

        // Start both thread
        r1.run();
        r2.run();

  /*
     * the BiFunction interface, which has angle brackets with three string values inside.
     * This indicate the two values that are coming in are going to be strings,
     * and the return value will be a string  */

        BiFunction<String, String, String> conct = (a, b) ->(a + b);
        String sentence = conct.apply("Today is ","a great day");
        System.out.println(sentence);


        /*
        Consumer<String> hello = (name) -> System.out.println("Hello, "+name);    * */
        Consumer<String> hello = name -> System.out.println("Hello, " + name);
        for(String name : Arrays.asList("Duke","Mickey","Minnie")){
            hello.accept(name);
        }
    }
}
