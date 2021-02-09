package lambdaExpression.functionalInterfaceWithLambda;

public class NoReturnNoArgs {

    public static void main(String[] args) {

        NoReturnNoArgsInterface noArgs = new NoReturnNoArgsInterface() {
            @Override
            public void display() {
                System.out.println("nothing to display");
            }
        };

        noArgs.display();

        /**using Lambda expression*/
        NoReturnNoArgsInterface noArgs1 = () -> System.out.println("Nothing to display in Lambdas and equals to Consumer<String> Interface");
        noArgs1.display();
    }
}
