package wildCrad;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building());
        buildings.add(new Office());
        buildings.add(new House());
        printAllBuildings(buildings);

        /**
         *  I cannot pass either of these lists into the printBuilding methods.
         *  Because the list of type office is not a subtype of a list of type building.
         *  And nor is a list of type house. When I try and do this, I get a compile time error.
         *  One solution would be to create a new method for each different subtype of building.
         */

        List<Office> offices = new ArrayList<>();
        offices.add(new Office());
        offices.add(new Office());
        printAllBuildings(offices);

        List<House> houses = new ArrayList<>();
        houses.add(new House());
        houses.add(new House());
       printAllBuildings(houses);

        addHouseToList(buildings);
        addHouseToList(houses);
    }

    /**
     *
     * But a quicker and simpler solution is to use wildcards. In the list of arguments in the printBuildings method,
     * I currently specify that it takes a list of type Building. To use a wildcard,
     * I put a question mark and then write extends.Before the word building.
     * This means that I can now pass in lists of any type that extends the building class.
     * So I no longer get errors when I try and pass in the list of offices or a list of houses.
     *
     * @param buildings
     */

    private static void printAllBuildings(List<? extends Building> buildings) {

        System.out.println("Printing out all building in Array List: ");
        for (int i = 0; i <buildings.size() ; i++) {
            System.out.println(i+1 +": "+ buildings.get(i).toString());
        }
    }

    /**
     *  with out using wildcard methods look like this....
     */

//    private static void printAllBuildings(List<Building> buildings) {
//
//        System.out.println("Printing out all building in Array List: ");
//        for (int i = 0; i <buildings.size() ; i++) {
//            System.out.println(i+1 +": "+ buildings.get(i).toString());
//        }
//    }

    /**
     *  Wildcards can also be used to specify that super types can be used when a subtype is specified.
     *  In this main class, I also have a method called addHouseToList, which takes a list of houses as an argument and adds a new house to it.
     *  Currently,I can only pass in a list of houses to this method. But if I wanted to be able to pass in a list of Buildings, I can use wildcards again.
     *  This time, I've put a question mark and the word super in front of house, where I specify the type of list. Now,
     *  I can pass in a list of buildings to this method, because building is a super type of House.
     *  If you are unsure about when to use extends and when to use super with wildcards,
     *
     * @param building
     *
     */

    static void addHouseToList(List<? super House> building){

        building.add(new House());
    }


    /**
     *  with out using wildcard method look like this
     *
     * */
//    static void addHouseToList(List<House> building){
//
//        building.add(new House());
//    }


    /**
     *  If you are unsure about when to use extends and when to use super with wildcards,
     *  you can think about invariables and outvariables. In the printBuildings method,
     *  I am passing in a list which provides data which I use inside the method, so this in an invariable.
     *  With invariables, it makes sense to use extends. In the addHouseToList method,
     *  I am using the method to give additional data by adding to the list. So this is an outvariable.
     *  And in this case it makes sense to use super.
     *
     *
     */

}
