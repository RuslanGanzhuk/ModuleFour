package goit.javaOnline3.Distance;

public class DistanceDot {

    public static void distance (String[] args) {

        Coordinates coordinates = new Coordinates(4,5,2,7);

        System.out.println("Расстояние между точками = ");
        System.out.println(coordinates.getDistanceBetweenDot());
    }
}

//баг с пакетами

//где метод main()?