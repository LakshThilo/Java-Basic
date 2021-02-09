package lambdaExpression.moreExamples;

public class RunnableExample {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable interface");
            }
        });

        thread1.run();

//      Using lambda expression
        Thread thread = new Thread(() -> System.out.println("Runnable interface using lambda"));
        thread.run();
    }

}
