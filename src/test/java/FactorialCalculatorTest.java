import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FactorialCalculatorTest {

    @Test
    public void testFactorialOfZero() {
        assertEquals(1, FactorialCalculator.factorial(0), "Факториал 0 должен равняться 1");
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(1, FactorialCalculator.factorial(1), "Факториал 1 должен равняться 1");
        assertEquals(120, FactorialCalculator.factorial(5), "Факториал 5 должен равняться 120");
        assertEquals(720, FactorialCalculator.factorial(6), "Факториал 6 должен равняться 720");
        assertEquals(3628800, FactorialCalculator.factorial(10), "Факториал 10 должен равняться 3628800");
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalculator.factorial(-1);
        });
        assertEquals("Число должно быть неотрицательным", exception.getMessage());
    }
}
