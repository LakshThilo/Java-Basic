package collection.List_Inteface.linkedListExample;

import java.util.LinkedList;

public class Store {

    public static void main(String[] args) {

        LinkedList<Customer> queue = new LinkedList<>();
        queue.add(new Customer("David"));
        queue.add(new Customer("Lak"));
        queue.add(new Customer("Thilo"));

        System.out.println(queue);
        serveCustomer(queue);
        System.out.println(queue);


    }

    static void serveCustomer(LinkedList<Customer> queue){


        /**
         *  The queue interface provides us with a method to do this called poll so I am going to write customer c is equal to queue.poll.
         *  The poll method returns the first customer in the queue and also removes them from the queue.
         *  Next I will call the serve method on the customer that has been removed from the queue.
         *
         */
        Customer c = queue.poll();
        System.out.println(c.toString());
        c.serve();
    }
}
