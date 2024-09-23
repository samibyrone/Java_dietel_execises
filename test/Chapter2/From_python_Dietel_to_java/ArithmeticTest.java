package Chapter2.From_python_Dietel_to_java;

import org.junit.jupiter.api.Test;
import static Chapter2.From_python_Dietel_to_java.Arithmetic.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticTest {

    @Test
    public void test_for_arithmetic_addition_operators() {
       double right_operand = 2;
       double left_operand = 27.5;
       double addition = arithmetic_addition_operators(right_operand, left_operand);
       assertEquals(addition, 29.5);
    }

    @Test
    public void test_for_arithmetic_subtraction_operators() {
        double right_operand = 2;
        double left_operand = 27.5;
        double subtraction = arithmetic_subtraction_operators(right_operand, left_operand);
        assertEquals(subtraction, -25.5);
    }

    @Test
    public void test_for_arithmetic_division_operators() {
        double right_operand = 2;
        double left_operand = 27.5;
        double division = arithmetic_division_operators(right_operand, left_operand);
        assertEquals(division, 0.07272727272727272);
    }

    @Test
    public void test_for_arithmetic_multiplication_operators() {
        double right_operand = 2;
        double left_operand = 27.5;
        double multiplication = arithmetic_multiplication_operators(right_operand, left_operand);
        assertEquals(multiplication, 55.0);
    }

    @Test
    public void test_for_arithmetic_exponential_operators() {
        double right_operand = 2;
        double left_operand = 27.5;
        double exponent = arithmetic_exponent_operators(right_operand, left_operand);
        assertEquals(exponent, 189812531.24850312);
    }

    @Test
    public void test_for_arithmetic_floor_division_operators() {
        double right_operand = 2;
        double left_operand = 27.5;
        double floor_division = arithmetic_floor_division_operators(right_operand, left_operand);
        assertEquals(floor_division, 0.0);
    }
}
