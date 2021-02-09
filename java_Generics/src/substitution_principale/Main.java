package substitution_principale;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Building building = new Building();
        Office office = new Office();
        buildMe(building);
        buildMe(office);

        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building());
        buildings.add(new Office());
        printAllBuildings(buildings);

        /**
         * The substitution principle lets you assign variables of a given type
         * to the subtype but the principle does not apply with types of lists
         */
        List<Office> offices = new ArrayList<>();
        offices.add(new Office());
        offices.add(new Office());
       // printAllBuildings(offices);
    }

    private static void printAllBuildings(List<Building> buildingds) {

        System.out.println("Printing out all building in Array List: ");
        for (int i = 0; i <buildingds.size() ; i++) {
            System.out.println(i+1 +": "+ buildingds.get(i).toString());
        }
    }

    private static void buildMe(Building building) {

        System.out.println("Printing out the "+ building.toString());
    }


}
