package lambdaExpression.exampleFuntionalInteface;


/**
 *  In Java 8, a new feature was introduced called lambdas.
 *  Lambdas represent the implementation of a functional interface.
 *  So before learning how to implement lambdas,
 *  it's as useful to understand what a functional interface is.
 *  A functional interface is an interface that has *//* only one abstract method *//**
 *
 */

@FunctionalInterface
public interface GreetingMessage {

    public abstract void greet(String name);

}
