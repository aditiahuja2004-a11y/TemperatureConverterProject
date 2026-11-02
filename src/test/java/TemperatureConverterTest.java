import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for {@link TemperatureConverter}.
 * Written test-first, following the Red-Green-Refactor cycle.
 */
public class TemperatureConverterTest {

    private final TemperatureConverter converter = new TemperatureConverter();

    @Test
    void testCelsiusToFahrenheitFreezingPoint() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0.0), 0.01);
    }

    @Test
    void testCelsiusToFahrenheitBoilingPoint() {
        assertEquals(212.0, converter.celsiusToFahrenheit(100.0), 0.01);
    }

    @Test
    void testFahrenheitToCelsiusBoilingPoint() {
        assertEquals(100.0, converter.fahrenheitToCelsius(212.0), 0.01);
    }

    @Test
    void testFahrenheitToCelsiusFreezingPoint() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32.0), 0.01);
    }

    @Test
    void testCelsiusToKelvinFreezingPoint() {
        assertEquals(273.15, converter.celsiusToKelvin(0.0), 0.01);
    }

    @Test
    void testCelsiusToKelvinBoilingPoint() {
        assertEquals(373.15, converter.celsiusToKelvin(100.0), 0.01);
    }
}
