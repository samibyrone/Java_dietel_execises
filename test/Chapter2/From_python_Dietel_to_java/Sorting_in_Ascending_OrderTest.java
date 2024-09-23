package Chapter2.From_python_Dietel_to_java;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static Chapter2.From_python_Dietel_to_java.Sorting_in_Ascending_Order.number_ascending_order;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Sorting_in_Ascending_OrderTest {

    @Test
    public void test() {
        double number1 = 200;
        double number2 = 70;
        double number3 = 540;
    }

    @Test
    public void Number_sorting_in_ascending_orderTest() {
        int number1 = 200;
        int number2 = 70;
        int number3 = 540;
        double[] ascending = number_ascending_order(number1, number2, number3);
        assertTrue(true, Arrays.toString(ascending));
    }

    @Test
    public void Number_sorting_in_ascending_order_with_negative_numbersTest() {
        int number1 = -260;
        int number2 = -720;
        int number3 = -50;
        double[] ascending = number_ascending_order(number1, number2, number3);
        assertTrue(true, Arrays.toString(ascending));
    }
}
