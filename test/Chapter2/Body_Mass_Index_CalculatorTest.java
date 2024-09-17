package Chapter2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Body_Mass_Index_CalculatorTest {

    private Body_Mass_Index_Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Body_Mass_Index_Calculator();
    }

    @Test
    public void testFor_Mass_Weight() {
        double weight = 45;
        double height = 1.65;
        String outcome = calculator.Body_Mass_Calculator(weight, height);
        assertEquals("Your are UnderWeight", outcome);
    }

    @Test
    public void testFor_Normal_Weight() {
        double weight = 65;
        double height = 1.72;
        String outcome = calculator.Body_Mass_Calculator(weight, height);
        assertEquals("You Have a Normal Weight", outcome);
    }

    @Test
    public void testFor_TooMuch_Weight_Or_OverWeight() {
        double weight = 85;
        double height = 1.75;
        String outcome = calculator.Body_Mass_Calculator(weight, height);
        assertEquals("You are Getting OverweightYou are Getting Overweight", outcome);
    }

    @Test
    public void testFor_Excess_Weight_Or_Obesity() {
        double weight = 100;
        double height = 1.75;
        String outcome = calculator.Body_Mass_Calculator(weight, height);
        assertEquals("You Have Too Much Obesity, You Really need to Work on Yourself", outcome);

    }
}
