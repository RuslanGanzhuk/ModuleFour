package goit.javaOnline3.CalculatorTemperature;

public class Celsius {

    private int temperatureCelsius;
    private double temperatureFahrenheit;

   Celsius(int temperatureCelsius) {

       this.temperatureCelsius = temperatureCelsius;
       double temperatureFahrenheit = 1.8 * this.temperatureCelsius + 32;

   }

      public double getTemperatureFahrenheit(){

          return temperatureFahrenheit;
      }
}


//баг с пакетами

//конструктор - для конструирования. Вычисления, не связанные с контруированием обьекта - вынеси в метод.

//Форматирование - отступы. Выровняй все.

//конструктор - для конструирования. Вычисления, не связанные с контруированием обьекта - вынеси в метод.


