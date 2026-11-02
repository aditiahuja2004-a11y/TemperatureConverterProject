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
}
