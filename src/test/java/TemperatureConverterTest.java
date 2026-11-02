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
}
