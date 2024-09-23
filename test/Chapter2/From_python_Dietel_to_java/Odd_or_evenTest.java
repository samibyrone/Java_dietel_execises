package Chapter2.From_python_Dietel_to_java;

import org.junit.jupiter.api.Test;

import static Chapter2.From_python_Dietel_to_java.Odd_or_even.is_number_even;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Odd_or_evenTest {

    @Test
    public void setup() {
        int number = 10;
    }

    @Test
    public void number_is_even_test(){
        int number = 10;
        boolean output = is_number_even(number);
        assertTrue(true, String.valueOf(output));
        assertEquals(is_number_even(200), true);
    }

    @Test
    public void number_is_odd_test(){
        int number = 15;
        boolean output = is_number_even(number);
        assertTrue(true, String.valueOf(output));
        assertEquals(is_number_even(279), false);
    }
}
