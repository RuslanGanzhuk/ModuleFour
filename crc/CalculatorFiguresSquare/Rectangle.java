
package goit.javaOnline3.CalculatorFiguresSquare;

public class Rectangle {

    private int lengthRectangle;
    private int widthRectangle;
    private int squareRectangle;

     Rectangle (int lengthRectangle, int widthRectangle) {

           this.lengthRectangle = lengthRectangle;
           this.widthRectangle = widthRectangle;
           squareRectangle = this.lengthRectangle * this.widthRectangle;

     }

    public int getSquareRectangle() {

        return squareRectangle;
    }
}
