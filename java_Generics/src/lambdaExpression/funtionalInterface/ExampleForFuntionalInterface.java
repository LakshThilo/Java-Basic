package lambdaExpression.funtionalInterface;

import java.util.function.*;

public class ExampleForFuntionalInterface {

    public static void main(String[] args) {

        /*
        * Predicates are Boolean valued functions of one argument meaning they take in one argument,
        * use a test method to evaluate it and return either true or false.
        * */
        // one argument with return type (true/false)
        Predicate<String> stringLen = (s)-> s.length()<10;
        System.out.println(stringLen.test("Apple") + " - Apple is less tha 10");



        /*
        * The Consumer interface consumes the argument. It accepts a single argument and does not return a result
        * */
        // one argument with no return value
        Consumer<String>  consumer = (s) -> System.out.println(s.toLowerCase());
        consumer.accept("ABCDefgtksahdjka");

        /*
        * Function which transforms a value from one type to another. It accepts one argument and produces a result.
        * */
        // one argument with return value
        Function<Integer,String> converter = (num) -> Integer.toString(num);
        System.out.println("lenght of 26: "+ converter.apply(26).length());

        /*
        * Supplier supplies a value. It produces a result of a given type.
        * Unlike Functions, Suppliers do not accept arguments but they do return a result
        * */
        // no argument with return one value
        Supplier<String> s= () -> "Java is fun";
        System.out.println(s.get());


        /*
         * the BinaryOperator interface takes two arguments and returns one
         * */
        // take two arguments with return value
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("Add 10 + 25 is: "+ add.apply(10,15));


        /*
         * UnaryOperator interface takes a single argument and returns a single value
         * */
        UnaryOperator<String> str = (msg) -> msg.toUpperCase();
        System.out.println(str.apply("This is my message upper case"));
     }


}
