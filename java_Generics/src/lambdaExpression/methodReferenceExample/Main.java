package lambdaExpression.methodReferenceExample;

/**
 *  I can now use a method reference to make this code shorter and simpler.
 *  I can do this because all I'm using the lambda for is calling a single method
 *  on the square object that I am passing in. The syntax for a method reference
 *  is to begin with the name of the class followed by two colons
 *  followed by the name of the method
 *
 */

public class Main {


    public static void main(String[] args) {


        Square s = new Square(4);


        // using lambda expression
        Shapes shape = square -> square.calculateArea();

        // This is call method reference
        Shapes shapes = Square::calculateArea;


        System.out.println("Calculate Area of Shape using Lambda: "+shape.getArea(s));
        System.out.println("Calculate Area of Shape using method reference: "+shapes.getArea(s));

    }
}
