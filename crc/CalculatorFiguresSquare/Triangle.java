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

//баг с пакетами

//конструктор - для конструирования. Вычисления, не связанные с контруированием обьекта - вынеси в метод.

//Triangle.getSquareTriangle() - масло масленное. В треугольнике логично, что мы берем площадь треугольника.