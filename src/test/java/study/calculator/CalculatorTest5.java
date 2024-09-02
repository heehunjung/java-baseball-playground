package study.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import study.Calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest5 {
    Calculator cal;

    @BeforeEach
    public void setUp() {
        cal = new Calculator();
    }

    @Test
    public void addTest() {
        assertEquals(7,cal.add(3,4));
    }
    @Test
    public void subTest() {
        assertEquals(1,cal.subtract(5,4));
    }
    @Test
    public void mulTest() {
        assertEquals(6,cal.multiply(2,3));
    }
    @Test
    public void divTest() {
        assertEquals(2,cal.divide(8,4));
    }
    @AfterEach
    public void tearDown() {
        cal = null;
    }
}
