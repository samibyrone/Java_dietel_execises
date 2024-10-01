package Chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClockTest {

    private Clock clock;

    @BeforeEach
    public void setUp() {
        clock = new Clock(23, 45, 50);
    }

    @Test
    public void test_to_initialize_the_time() {
        clock.setHour(12);
        clock.setMinute(45);
        clock.setSecond(50);
    }

    private void time() {
        clock.setHour(12);
        clock.setMinute(45);
        clock.setSecond(50);
    }

    @Test
    public void test_to_initialize_and_validate_the_time() {
        time();
        assertTrue(clock.getHour() == 12);
        assertTrue(clock.getMinute() == 45);
        assertTrue(clock.getSecond() == 50);
    }

   @Test
    public void test_to_set_invalid_hour() {
        time();
        clock.setHour(24);
        assertTrue(clock.getHour() == 0);
   }

   @Test
    public void test_to_set_invalid_minute() {
        time();
        clock.setMinute(60);
        assertTrue(clock.getMinute() == 0);
   }

   @Test
    public void test_to_set_invalid_second() {
        time();
        clock.setSecond(60);
        assertTrue(clock.getSecond() == 0);
   }

   @Test
    public void test_that_display_time_format() {
        time();
        clock.setHour(7);
        clock.setMinute(5);
        clock.setSecond(8);
        assertTrue(clock.timeFormatDisplay().equals("07:05:08"));
   }

   @Test
    public void test_that_display_time_with_min_value() {
        time();
        clock.setHour(0);
        clock.setMinute(0);
        clock.setSecond(0);
        assertTrue(clock.timeFormatDisplay().equals("00:00:00"));
   }

   @Test
    public void test_that_display_time_with_max_value() {
        time();
        clock.setHour(23);
        clock.setMinute(59);
        clock.setSecond(59);
        assertTrue(clock.timeFormatDisplay().equals("23:59:59"));
   }
}
