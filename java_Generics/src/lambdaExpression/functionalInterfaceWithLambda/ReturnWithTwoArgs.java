package lambdaExpression.functionalInterfaceWithLambda;

public class ReturnWithTwoArgs {

    public static void main(String[] args) {

        ReturnWithTwoArgsInterface num = new  ReturnWithTwoArgsInterface(){


            @Override
            public int calValue(int x, int y) {
                return x + y;
            }
        };

        int answer = num.calValue(10,20);
        System.out.println("Answer is: "+answer );


        ReturnWithTwoArgsInterface add = (x, y) -> x + y;
        ReturnWithTwoArgsInterface minus = (x, y) -> x - y;
        ReturnWithTwoArgsInterface difference = (x, y) ->Math.abs(x-y);
        ReturnWithTwoArgsInterface divide = (x, y) -> (y != 0 ? x/y : 0);

        System.out.println(add.calValue(30,40));
        System.out.println(minus.calValue(70,40));
        System.out.println(difference.calValue(30,40));
        System.out.println(divide.calValue(1,0));
    }

}
