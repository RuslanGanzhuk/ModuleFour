
package goit.javaOnline3.CalculatorFiguresSquare;

public class Circule {

    private int radiusCircle;
     private double squareCircle;

    Circule (int radiusCircle) {

         this.radiusCircle = radiusCircle;
           squareCircle = Math.PI * (this.radiusCircle * this.radiusCircle);

    }

        public double getSquareCircle() {

        return squareCircle;
        }


}
