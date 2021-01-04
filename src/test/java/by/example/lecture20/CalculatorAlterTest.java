package by.example.lecture20;

import org.junit.*;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class CalculatorAlterTest {

    @Rule
    public ExpectedException expectedExceptionRule = ExpectedException.none();

    @DataPoints
    public static int[][] data() {
        return new int[][]{
                {7, 10},
                {10, 7}
        };
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Set up");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Tear down");
    }

    @Theory
    public void testSum(int[] input) {

        // GIVEN

        // WHEN
        int sum = Calculator.sum(input[0], input[1]);

        // THEN
        Assert.assertEquals(17, sum);
        Assert.assertNotEquals(3, sum);

    }

    @Theory
    public void testSubtract(int[] input) {

        // GIVEN

        // WHEN
        int difference = Calculator.subtract(input[0], input[1]);

        // THEN
        Assert.assertEquals(-3, difference);
        Assert.assertNotEquals(3, difference);

    }

    @Theory
    public void testMultiplicate(int[] input) {

        // GIVEN

        // WHEN
        int mult = Calculator.multiplicate(input[0], input[1]);

        // THEN
        Assert.assertEquals(70, mult);
        Assert.assertNotEquals(3, mult);

    }

    @Theory
    public void testDivide(int[] input) {


        // GIVEN

        // WHEN
        double quotient = Calculator.divide(input[0], input[1]);

        // THEN
        Assert.assertEquals(0.7, quotient, 0.0);
        Assert.assertNotEquals(3, quotient);

    }

    @Test
    public void testDivideWhenZero() {

        // GIVEN
        expectedExceptionRule.expect(ArithmeticException.class);
        int a = 7;
        int b = 0;

        // WHEN
        int quotient = a / b;

        // THEN

    }

    @Test(expected = ArithmeticException.class)
    public void testDivideWhenZeroAlter() {

        // GIVEN
        int a = 7;
        int b = 0;

        // WHEN
        int quotient = a / b;

        // THEN

    }

}