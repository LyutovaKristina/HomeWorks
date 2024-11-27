import org.junit.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    private FactorialCalculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new FactorialCalculator();
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(calculator.add(2, 3), 5);
        Assert.assertEquals(calculator.add(-1, 1), 0);
        Assert.assertEquals(calculator.add(-1, -1), -2);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(calculator.subtract(5, 3), 2);
        Assert.assertEquals(calculator.subtract(0, 5), -5);
        Assert.assertEquals(calculator.subtract(-5, -3), -2);
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(calculator.multiply(2, 3), 6);
        Assert.assertEquals(calculator.multiply(-1, 1), -1);
        Assert.assertEquals(calculator.multiply(0, 5), 0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(1, 0);
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(calculator.divide(6, 3), 2);
        Assert.assertEquals(calculator.divide(10, 2), 5);
    }
}
