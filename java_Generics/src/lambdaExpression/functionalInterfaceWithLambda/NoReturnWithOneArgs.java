package lambdaExpression.functionalInterfaceWithLambda;

public class NoReturnWithOneArgs {

    public static void main(String[] args) {

        NoReturnWithOneArgsInterface message = new NoReturnWithOneArgsInterface() {
            @Override
            public void printMe(String s) {
                System.out.println("Hello my friend: "+ s+ ".. How are you!");
            }
        };

        message.printMe("Lakshitha");

        NoReturnWithOneArgsInterface mess = (name) -> System.out.println("Hello again friend: "+name+".. You looking good.");
        mess.printMe("Thiloka");
    }

}
