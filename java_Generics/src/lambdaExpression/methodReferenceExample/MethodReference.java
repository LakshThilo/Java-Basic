package lambdaExpression.methodReferenceExample;

public class MethodReference {

    public static void main(String[] args) {

/**   what is this lambda expression doing now it's basically taking in our input arguments and it's executing a
      method so what this lambda expression is doing is a method execution okay then something like that happens when there
      is no input arguments and you're executing method with no parameters or if there are certain parameters over
      here and then you're passing those parameters to the method if these two match or if these two are obvious then
      there is a new syntax for it right and that is Method references   */

        //Thread t = new Thread(() -> printMessage());
        Thread t = new Thread(MethodReference::printMessage); // this is exact equal to above
        t.start();
    }

    public static void printMessage(){

        System.out.println("Message printer");
    }
}
