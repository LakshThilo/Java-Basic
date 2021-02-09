package lambdaExpression.moreExamples;

public class TypeInterfacesExamples {

    public static void main(String[] args) {

        StringLengthFinder sFinder = new StringLengthFinder() {
            @Override
            public int getStringLength(String s) {
                return s.length();
            }
        };
    // normal implementation
        System.out.println(" Using regular implementation: "+sFinder.getStringLength("this is a String"));

        StringLengthFinder finder = (String s) -> s.length();
        System.out.print(" Using lambda expression 1: ");
        System.out.println(finder.getStringLength("This is a String"));

        StringLengthFinder finder1 = (s) -> s.length();
        System.out.print(" Using lambda expression 2: ");
        System.out.println(finder1.getStringLength("This is a String"));

        StringLengthFinder finder2 = s -> s.length();
        System.out.print(" Using lambda expression 3: ");
        System.out.println(finder2.getStringLength("This is a String"));

        //passing interface to stativc method
        printLambda(s -> s.length());
    }

    public static void printLambda(StringLengthFinder s){

        System.out.print("passing Interface to the static method: ");
        System.out.println(s.getStringLength("This is a String"));
    }

    interface StringLengthFinder{

        int getStringLength(String s);
    }
}
