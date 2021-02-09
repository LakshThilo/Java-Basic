package lambdaExpression.exampleFuntionalInteface;

public class Main {

    public static void main(String[] args) {

        GreetingMessage gm = new GreetingMessage() {

            /**
             *  have implemented a new greeting message instance using an anonymous inner class
             *
             * @param name
             */
            @Override
            public void greet(String name) {
                System.out.println("Hello "+name);
            }
        };
        gm.greet("lak");


        /**
         * Instead of using all this boiler plate code,
         * I can use a lambda instead to make the code shorter and simpler
         *
         */

        GreetingMessage gm2 = (String name) -> {

            System.out.println("Hello "+ name);
        };
        gm2.greet("lak");

        MessagePrinter mp = () -> {

            System.out.println("Just calling method inside the MessagePrinter");
        };
        mp.messagePrint();
    }
}
