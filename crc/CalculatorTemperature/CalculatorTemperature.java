package goit.javaOnline3.CalculatorTemperature;

public class CalculatorTemperature {

    public static void calTemp () {

        Celsius celsius = new Celsius(5);

        System.out.println("Температура в цельсии = ");
        System.out.println(celsius.getTemperatureFahrenheit());


        Fahrenheyit fahrenheyit = new Fahrenheyit(12);

        System.out.println("Температура в Фаренгейт = ");
        System.out.println(fahrenheyit.getTemperaturCelsius());
    }
}

//баг с пакетами

//calTemp - что это значит? Call? Calculate? Еще что-то?

//не могу найти метод mein()

//по две пустые строки подряд - зачем?