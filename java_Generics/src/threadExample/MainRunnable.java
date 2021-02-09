package threadExample;

public class MainRunnable {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new RunnableExample());
        thread1.setName("Thread 1");
        thread1.start();


      /*  Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (i <= 20) {
                    System.out.println(i + " " + Thread.currentThread().getName());
                    i++;
                }
            }
        });*/


        /**
         *  I can actually make the code even shorten than this when I hover my mouse over runnable,
         *  IDE tells me that this anonymous inter class creation can be turned into a lambda expression.
         *  Because runnable is a functional interface which means that it defines only one abstract method,
         *  I can replace this code with a lambda.
         *
         */
        Thread thread2 = new Thread(() -> {
            int i = 0;
            while (i <= 20) {
                System.out.println(i + " " + Thread.currentThread().getName());
                i++;
            }
        });
            thread2.setName("Thread 2");
            thread2.start();

    }

}
