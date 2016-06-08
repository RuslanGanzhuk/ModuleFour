
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

//пустая первая строка - зачем?

//баг с пакетами

//конструктор - для конструирования. Вычисления, не связанные с контруированием обьекта - вынеси в метод.

//Circule.getSquareCircle() - масло масленное. В круге логично, что мы берем площадь круга.

//squareCircle = Math.PI * (this.radiusCircle * this.radiusCircle);
//раз уж ты используешь Math, возьми там и квадрат

//Форматирование - отступы. Выровняй все.