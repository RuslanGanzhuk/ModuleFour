package goit.javaOnline3.Distance;

public class Coordinates {

    private int dotX1;
    private int dotX2;
    private int dotY1;
    private int dotY2;
    private double distanceBetweenDot;

       Coordinates(int dotX1, int dotX2, int dotY1, int dotY2) {

             this.dotX1 = dotX1;
             this.dotX2 = dotX2;
             this.dotY1 = dotY1;
             this.dotY2 = dotY2;
             distanceBetweenDot = Math.sqrt(((this.dotX2 - this.dotX1) * (this.dotX2 - this.dotX1)) + ((this.dotY2 - this.dotY1) * (this.dotY2 - this.dotY1)));

    }

         public double getDistanceBetweenDot() {

             return distanceBetweenDot;
         }
}

//баг с пакетами

//Форматирование - отступы. Выровняй все.
