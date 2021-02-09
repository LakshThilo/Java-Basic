package lambdaExpression.methodAsLambdas;

import java.math.BigInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

public class MethodAsLambdas {

    public static void main(String[] args) {


        IntFunction<String> intToString = num -> Integer.toString(num);
        System.out.println("expected value 3, actual value: " +intToString.apply(123).length());



        IntFunction<String> intToString2 = Integer::toString;
        System.out.println("expected value 5, actual value: " +intToString2.apply(13453).length());

        /*
        * It's saying I'm going to give you a string and I want you to return a big integer.
        * On the right hand side I have an example of how we can use the colon colon with a constructor.
        * So it's saying that whatever string is coming in I'm going to create a new big integer.
        * So I'm going to convert the string value to a big integer.On the right hand side
        * I have an example of how we can use the colon colon with a constructor.
        * it's saying that whatever string is coming in I'm going to create a new big integer.
         * */
        Function<String, BigInteger> newBigInt = BigInteger::new;
        System.out.println("expected value 1234, actual value: " + newBigInt.apply("1234"));


        /*
        *in the right hand side notice the print line is an instance method of system.out.
        * It will automatically take in the string, provide it on line 39 and print it to the console.
        * */
        Consumer<String> print = System.out::println;
        print.accept("Coming to you directly from a lambda..");


        /*
        * It has the value hello::concat. The concat is the method that I'm actually going to be using,
        * and again I'm not specifying the fact that I'm going to provide a second string.
        * It can infer that
        * */
        UnaryOperator<String> makeGreeting = "Hello, "::concat;
        System.out.println(makeGreeting.apply("Lakshitha"));

    }
}
