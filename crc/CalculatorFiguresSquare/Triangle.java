package goit.javaOnline3.CalculatorFiguresSquare;

public class Triangle {

     private int sideTriangle;
     private int heightTriangle;
     private double squareTriangle;

    Triangle(int sideTriangle, int heightTriangle) {

          this.sideTriangle = sideTriangle;
         this.heightTriangle = heightTriangle;
          squareTriangle = (0.5 * this.sideTriangle) * this.heightTriangle;

    }
       public double getSquareTriangle() {

           return this.squareTriangle;
       }
}
