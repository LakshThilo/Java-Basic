package generic_methods;

public class Varargs {

    public static void main(String[] args) {
        String item1 = "Apples";
        String item2 = "Oranges";
        String item3 = "Pears";

        printShoppingList(item1,item2,item3);
        printShoppingList("Brad","Milk","Eggs","Bananas");



    }


    private static void printShoppingList(String... strings) {
        System.out.println("Shopping List in Array");

        for (String s : strings) {
            int i = 1;
            System.out.println(i++ +": " + s);
        }
    }


}
