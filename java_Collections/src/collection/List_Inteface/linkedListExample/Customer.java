package collection.List_Inteface.linkedListExample;

public class Customer {

    public String name;
    public boolean hasBeenServed;

    public Customer(String name){
        this.name = name;

    }

    public void serve(){
        hasBeenServed = true;
        System.out.println(name+"  has been served! ");

    }

    @Override
    public String toString() {
        return name;
    }
}
