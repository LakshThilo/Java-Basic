package lambdaExpression.methodReferenceExample;

public class Square {

    int sideLenght;

    public Square(int sideLenght){

        this.sideLenght = sideLenght;
    }

    public int calculateArea(){

        return sideLenght*sideLenght;
    }
}
