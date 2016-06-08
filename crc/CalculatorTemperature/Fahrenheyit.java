package goit.javaOnline3.CalculatorTemperature;

public class Fahrenheyit {

    private int temperaturFahrenheit;
    private double temperaturCelsius;

    Fahrenheyit(int temperaturFahrenheit) {

          this.temperaturFahrenheit = temperaturFahrenheit;
          temperaturCelsius = (this.temperaturFahrenheit - 32) / 8;

    }

       public double getTemperaturCelsius(){

           return temperaturCelsius;
       }
}

