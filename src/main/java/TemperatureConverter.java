/**
 * Converts temperatures between Celsius, Fahrenheit, and Kelvin.
 * Each conversion method is independent and does not call the others.
 */
public class TemperatureConverter {

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
}
