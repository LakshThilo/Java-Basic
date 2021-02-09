package lambdaExpression.functionalInterfaceWithLambda;

public class ReturnWithOneArg {

    public static void main(String[] args) {

        ReturnWithOneArgInterface oneArg =new  ReturnWithOneArgInterface(){

            @Override
            public int printMe(String s){
                return s.length();
            }

        };

        int length = oneArg.printMe("Print in method");
        System.out.println(length);
        System.out.println("Second time: "+oneArg.printMe("Print in method"));


        ReturnWithOneArgInterface one = (s) -> s.length() ;

        System.out.println(one.printMe("Nothing to loose"));


    }
}
