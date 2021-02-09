package excecise.Java9.Interfaces;

import java.util.Comparator;

public class MainClass {

    public static void main(String[] args) {

        Employee mike = new Employee("Mike",25000),
                luke = new Employee("Luke", 30000);

        Comparator<Employee> byName = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
    }
}
