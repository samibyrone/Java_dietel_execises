package Chapter2.From_python_Dietel_to_java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplesTest {

    @Test
    public void number_multiplesTest() {
        int number = 1024;
    }

    @Test
    public void multiples_of_number_using_4_Test() {
        int number = 1024;
        int output_result = Multiples.Number_multiples_of_4(number);
        assertEquals(output_result, 1024);
    }

    @Test
    public void multiples_of_number_using_any_figureTest() {
        int number = 7;
        int output_result = Multiples.Number_multiples_of_4(number);
        assertEquals(output_result, 7);
    }

    @Test
    public void multiples_of_number_using_a_negative_figureTest() {
        int number = -2000;
        int output_result = Multiples.Number_multiples_of_4(number);
        assertEquals(output_result, -2000);
    }

    @Test
    public void multiples_of_number_using_a_negative_odd_figureTest() {
        int number = -2110;
        int output_result = Multiples.Number_multiples_of_4(number);
        assertEquals(output_result, -2110);
    }

    @Test
    public void multiples_of_number_using_a_large_figureTest() {
        int number = 1000000000;
        int output_result = Multiples.Number_multiples_of_4(number);
        assertEquals(output_result, 1000000000);
    }

    @Test
    public void multiples_of_number_using_10_Test() {
        int number = 2;
        int output_result = Multiples.Number_multiples_of_10(number);
        assertEquals(output_result, 2);
    }

    @Test
    public void multiple_of_10_using_15_Test() {
        int number = 15;
        int output_result = Multiples.Number_multiples_of_10(number);
        assertEquals(output_result, 15);
    }

    @Test
    public void multiple_of_10_using_00_Test() {
        int number = 0;
        int output_result = Multiples.Number_multiples_of_10(number);
        assertEquals(output_result, number);
    }

    @Test
    public void multiple_of_10_using_negative_number_Test() {
        int number = -2000;
        int output_result = Multiples.Number_multiples_of_10(number);
        assertEquals(output_result, -2000);
    }

    @Test
    public void multiple_of_10_using_negative_odd_number_Test() {
        int number = -3579;
        int output_result = Multiples.Number_multiples_of_10(number);
        assertEquals(output_result, -3579);
    }

    @Test
    public void multiple_of_10_using_large_figure_Test() {
        int number = 1000000000;
        int output_result = Multiples.Number_multiples_of_10(number);
        assertEquals(output_result, 1000000000);
    }
}
