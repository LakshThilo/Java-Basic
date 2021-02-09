package collection.List_Inteface.linkedListExample;

import java.util.LinkedList;

public class LinkedListExample {

    /**
     *
     *
     */

    public static void main(String[] args) {


        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("C");
        list.add("B");
        list.add("K");
        System.out.println(list);
        list.remove("K");
        System.out.println(list);

    }
}
