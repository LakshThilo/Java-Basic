package deadLockExample;

/**
 * A deadlock can occur when two or more threats get blocked forever.
 * For example, this can happen when two threats are both waiting for resources held by each other.
 * In this example, I am simulating a situation with two cooks in a kitchen.
 * Imagine if both cooks wanted to mix some ingredients, so they both need a spoon and a bowl.
 * However, there is only one spoon and one bowl. The first cook picks up the spoon and at the same time,
 * the second cook picks up the bowl. Now both cooks are waiting for the other one to put down their object so they can pick it up.
 * This is a deadlock.
 *
 *
 */

public class Kitchen {

    public static Object spoon = new Object();
    public static Object bowl = new Object();

    public static void main(String[] args) {

        Thread cook1 = new Thread(() ->{

            /**
             * Inside the first thread is a synchronized block. A synchronized block or
             * synchronized statement is a section of codes that only one thread can enter at a time.
             * This means that you can have synchronized code inside a non synchronized method.
             */

            /*  The object in brackets is known as a monitor object.
                 And this means that if a thread is inside the synchronized block,
                 no other thread can do anything with that object.
                 The first thread, cook one, has a synchronized block with a spoon as the monitor object
                 It then tries to enter a second synchronized block with bowl as the monitor object
              */
            synchronized (spoon){
               System.out.println("Cook1: Holding the spoon..");
               System.out.println("Cook1: Waiting for the bowl..");

           synchronized (bowl){
               System.out.println("Cook1: Holding the spoon and bowl.");
             }
           }

        });

        /**
         * The second thread, cook two, does exactly the same except it uses
         * the bowl as the monitor lock first and the spoon second.
         * I then cause start on both of the threads so that they run at the same time.
         */
        Thread cook2 = new Thread(() ->{
            //synchronized (bowl){ //--------> fix it is to make both cooks try and pick up the same object first
            synchronized (spoon){

                System.out.println("Cook2: Holding the bowl..");
                System.out.println("Cook2: Waiting for the spoon..");

               // synchronized (bowl){   //-----------------> fix it is to make both cooks try and pick up the same object first
                synchronized (bowl){
                    System.out.println("Cook2: Holding the spoon and bowl.");
                }
            }

        });

        cook1.start();
        cook2.start();

        /**
         *
         * he output shows that cook one has the spoon and is waiting for the bowl. Meanwhile,
         * cook two has the bowl and is waiting for the spoon. What has happened is that
         * the thread called cook one has entered the synchronized block with the spoon as the monitor object.
         * At the same time, cook two has locked the bowl object.
         * So now cook one has the spoon and is waiting for the bowl object to be free.
         * But cook two has the bowl object and is waiting for the spoon object to be free.
         * So both threads will be waiting forever.
         */

        /*
        * How to fix this depends on the situation and the context. In general,
        * it is better to avoid using nested blocks of synchronized code like this.
        * In this example, one way to fix it is to make both cooks try and pick up the same object first
        * . So I will make the second cook pick up the spoon and then the bowl.
         */
    }
}
