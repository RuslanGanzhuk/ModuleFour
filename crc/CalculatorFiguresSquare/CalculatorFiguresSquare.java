
package goit.javaOnline3.CalculatorFiguresSquare;

public class CalculatorFiguresSquare {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(30,20);

        System.out.println("Площадь треугольника равна = ");
        System.out.println(triangle.getSquareTriangle());


        Rectangle rectangle = new Rectangle(4,4);


        System.out.println("Площадь прямоугольника равна = ");
        System.out.println(rectangle.getSquareRectangle());


        Circule circule = new Circule(6);

        System.out.println("Площадь круга равна = ");
        System.out.println(circule.getSquareCircle());


    }
}
