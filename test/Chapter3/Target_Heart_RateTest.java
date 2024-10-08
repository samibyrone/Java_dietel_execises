package Chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Calendar;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Target_Heart_RateTest {

    private Target_Heart_Rate target;

    @BeforeEach
    public void setUp() {
        target = new Target_Heart_Rate("segun", "ademola", "male", 25, 6,2004);
    }

    @Test
    public void test_heart_rate_calculator() {
        targetPerson();
    }

    private void targetPerson() {
        target.setFirstName("segzy");
        target.setLastName("ademola");
        target.setGender("male");
        target.setDay(25);
        target.setMonth(6);
        target.setYear(2004);
    }

    @Test
    public void test_for_person_heart_rate_first_name() {
        targetPerson();
        target.setFirstName("segzy");
        assertEquals(target.getFirstName().equals("segzy"), true);
    }

    @Test
    public void test_for_person_heart_rate_last_name() {
        targetPerson();
        target.setLastName("taiwo");
        assertEquals(target.getLastName().equals("taiwo"), true);
    }

    @Test
    public void test_for_person_heart_rate_gender() {
        targetPerson();
        target.setGender("female");
        assertEquals(target.getGender().equals("female"), true);
    }

    @Test
    public void test_for_person_heart_rate_birth_day() {
        targetPerson();
        target.setDay(25);
        assertEquals(target.getDay() == 25, true);
    }

    @Test
    public void test_for_person_heart_rate_birth_month() {
        targetPerson();
        target.setMonth(6);
        assertEquals(target.getMonth() == 6, true);
    }

    @Test
    public void test_for_person_heart_rate_birth_year() {
        targetPerson();
        target.setYear(2014);
        assertEquals(target.getYear() == 2014, true);
    }

    @Test
    public void test_for_person_heart_rate_age_for_leap_year() {
        targetPerson();
        target.setDay(29);
        target.setMonth(2);
        target.setYear(2006);
        assertEquals(target.getAge() == 18, true);
    }

    @Test
    public void test_for_person_heart_rate_age_for_non_leap_year() {
        targetPerson();
        target.setDay(29);
        target.setMonth(2);
        target.setYear(2005);
        assertEquals(target.getAge() == 19, true);
    }

    @Test
    public void test_for_person_heart_rate_age_for_current_age() {
        int personAge = Calendar.getInstance().get(Calendar.YEAR);
        int age = personAge - target.getYear();
        assertEquals(age, target.getAge());
    }

    @Test
    public void test_for_person_heart_rate_age_for_future_birthday_and_age() {
        targetPerson();
        target.setYear(2025);
        assertEquals(-1, target.getAge());
    }

    @Test
    public void test_for_person_maximum_heart_beat_rate() {
        int thisYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = thisYear - target.getYear();
        assertEquals(220 - age, target.getMaximumHeartBeatRate());
    }

    @Test
    public void test_for_person_maximum_heart_beat_rate_range() {
        int heartBeatRate = target.getMaximumHeartBeatRate();
        String heartBeatRange = String.format("%.0f - %.0f", heartBeatRate * 0.5, heartBeatRate * 0.85);
        assertEquals(heartBeatRange, target.getMaximumHeartBeatRateRange());
    }
}
