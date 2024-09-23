package Chapter2.From_python_Dietel_to_java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static Chapter2.From_python_Dietel_to_java.Circle_area_diameter_and_circumference.*;

public class Circle_area_diameter_and_circumferenceTest {

    @Test
    public void test_area_circle() {
        int radius = 2;
        double pi = 3.14159;
        double circle_area = circle_of_area(radius, pi);
        assertEquals(circle_area, 12.56636);
    }

    @Test
    public void test_circle_of_diameter() {
        int radius = 2;
        double circle_diameter = circle_of_diameter(radius);
        assertEquals(circle_diameter, 4);
    }

    @Test
    public void test_circle_of_circumference() {
        int radius = 2;
        double pi = 3.14159;
        double circle_circumference = circle_of_circumference(radius, pi);
        assertEquals(circle_circumference, 12.56636);
    }

}
