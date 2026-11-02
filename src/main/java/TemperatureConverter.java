/**
 * Converts temperatures between Celsius, Fahrenheit, and Kelvin.
 * Each conversion method is independent and does not call the others.
 */
public class TemperatureConverter {

    /**
     * Converts Celsius to Fahrenheit using F = (C x 9.0 / 5.0) + 32.
     *
     * @param celsius temperature in degrees Celsius
     * @return temperature in degrees Fahrenheit
     */
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    /**
     * Converts Fahrenheit to Celsius using C = (F - 32) x (5.0 / 9.0).
     *
     * @param fahrenheit temperature in degrees Fahrenheit
     * @return temperature in degrees Celsius
     */
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * (5.0 / 9.0);
    }
}
