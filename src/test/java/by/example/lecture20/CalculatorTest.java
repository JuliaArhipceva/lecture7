package by.example.lecture20;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class CalculatorTest {

    private final int a;
    private final int b;

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{{7, 10}, {10, 7}});
    }

    public CalculatorTest(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSum() {

        // GIVEN

        // WHEN
        int sum = Calculator.sum(a, b);

        // THEN
        Assert.assertEquals(17, sum);
        Assert.assertNotEquals(3, sum);

    }

    @Test
    public void testSubtract() {

        // GIVEN

        // WHEN
        int difference = Calculator.subtract(a, b);

        // THEN
        Assert.assertEquals(-3, difference);
        Assert.assertNotEquals(3, difference);

    }

    @Test
    public void testMultiplicate() {

        // GIVEN

        // WHEN
        int mult = Calculator.multiplicate(a, b);

        // THEN
        Assert.assertEquals(70, mult);
        Assert.assertNotEquals(3, mult);

    }

    @Test
    public void testDivide() {


        // GIVEN

        // WHEN
        double quotient = Calculator.divide(a, b);

        // THEN
        Assert.assertEquals(0.7, quotient, 0.0);
        Assert.assertNotEquals(3, quotient);

    }

}