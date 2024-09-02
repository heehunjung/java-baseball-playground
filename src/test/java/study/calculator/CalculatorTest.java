package study.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import study.Calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Before
    public void setup(){
        System.out.println("set up");
    }

    @Test
    public void test1() throws Exception{
        System.out.println("test1");
    }

    @Test
    public void test2() throws Exception{
        System.out.println("test2");
    }

    @After
    public void tearDown(){
        System.out.println("teardown");
    }
}
