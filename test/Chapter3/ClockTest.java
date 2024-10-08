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
        assertEquals(12, clock.getHour());
        assertEquals(45, clock.getMinute());
        assertEquals(50, clock.getSecond());
    }

   @Test
    public void test_to_set_invalid_hour() {
        time();
        clock.setHour(24);
       assertEquals(0, clock.getHour());
   }

   @Test
    public void test_to_set_invalid_minute() {
        time();
        clock.setMinute(60);
       assertEquals(0, clock.getMinute());
   }

   @Test
    public void test_to_set_invalid_second() {
        time();
        clock.setSecond(60);
       assertEquals(0, clock.getSecond());
   }

   @Test
    public void test_that_display_time_format() {
        time();
        clock.setHour(7);
        clock.setMinute(5);
        clock.setSecond(8);
       assertEquals("07:05:08", clock.timeFormatDisplay());
   }

   @Test
    public void test_that_display_time_with_min_value() {
        time();
        clock.setHour(0);
        clock.setMinute(0);
        clock.setSecond(0);
       assertEquals("00:00:00", clock.timeFormatDisplay());
   }

   @Test
    public void test_that_display_time_with_max_value() {
        time();
        clock.setHour(23);
        clock.setMinute(59);
        clock.setSecond(59);
       assertEquals("23:59:59", clock.timeFormatDisplay());
   }
}
