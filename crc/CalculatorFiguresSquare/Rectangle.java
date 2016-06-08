
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

//баг с пакетами

//конструктор - для конструирования. Вычисления, не связанные с контруированием обьекта - вынеси в метод.

//пустая первая строка - зачем?

//Rectangle.getSquareRectangle() - масло масленное. В прямоугольнике логично, что мы берем площадь прямоугольника.