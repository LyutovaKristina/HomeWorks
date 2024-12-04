import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class FactorialCalculatorTest {

    @org.junit.jupiter.api.Test
    public void testFactorialOfZero() {
        assertEquals(1, FactorialCalculator.factorial(0), "Факториал 0 должен равняться 1");
    }
    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(1, FactorialCalculator.factorial(1), "Факториал 1 должен равняться 1");
    }
    @Test
    public void testFactorialOfPositiveNumber2() {
        assertEquals(2, FactorialCalculator.factorial(2), "Факториал 2 должен равняться 2");
    }
    @Test
    public void testFactorialOfPositiveNumber3() {
        assertEquals(6, FactorialCalculator.factorial(3), "Факториал 3 должен равняться 6");
    }
    @Test
    public void testFactorialOfPositiveNumber9() {
        assertEquals(		362880, FactorialCalculator.factorial(9), "Факториал 9 должен равняться 362880");
    }
    @Test
    public void testFactorialOfPositiveNumber10() {
        assertEquals(		3628800, FactorialCalculator.factorial(10), "Факториал 10 должен равняться 3628800");
    }
    @Test
    public void testFactorialOfPositiveNumber11() {
        assertEquals(		39916800, FactorialCalculator.factorial(11), "Факториал 11 должен равняться 39916800");
    }
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegativeNumber() {
        FactorialCalculator.factorial(-1);
    }
    @Test
    public void testFactorialOfNegativeNumber() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalculator.factorial(-1);
        });
        assertEquals("Число должно быть неотрицательным", exception.getMessage());
    }
}
