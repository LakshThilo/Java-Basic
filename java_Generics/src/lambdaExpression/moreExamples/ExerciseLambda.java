package lambdaExpression.moreExamples;

public class ExerciseLambda {

//     example 1 -way one
/**
         greetingFunction = () -> System.out.print("Hello World");

         greet(greetingFunction);*/

//      way 2
 /**
             greet(() -> System.out.print("Hello World"));*/

 //           function with argument
/**           doubleNumberFunction = public int findDouble(int a){ return a*2; }*/

 //           to convert this method to lambda
 /*              1. remove the access modifier
                 2. remove method name
                 3. remove the return type*/ //(because compiler already know what is going to return)
/*               4. remove the return keyword */ //(because in lambda expression it is invalid)

        /** doubleNumberFunction = (int a) -> a * 2;  */

//       example 2
/**
            addFunction = (int a,int b) () -> a +b;  */

//       example 3

    /**
            stringLenghtFunction = (String s) -> s.length();
     */


    public static void main(String[] args) {


        Greeting greet = () -> System.out.println("This is a greeting");
        greet.greet();
    }

}
