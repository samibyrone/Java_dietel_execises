package Chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Calendar;
import static org.junit.jupiter.api.Assertions.*;

public class Health_RecordsTest {

    private Health_Records healthRecord;

    @BeforeEach
    public void setUp() {
        healthRecord = new Health_Records("sammy", "olamide", "male", 5, 25, 2005, 65, 120);
    }

    @Test
    public void test_for_Health_Records_profile() {
        healthRecord.setFirstName("Samson");
        healthRecord.setLastName("Ibironke");
        healthRecord.setGender("Male");
        healthRecord.setBirthDay(25);
        healthRecord.setBirthMonth(7);
        healthRecord.setBirthYear(2005);
        healthRecord.setHeight(6.5);
        healthRecord.setWeight(135);
    }

    @Test
    public void test_for_Profile_record_first_name() {
        healthRecord.setFirstName("Bolaji");
        assertEquals(healthRecord.getFirstName().equals("Bolaji"), true);
    }

    @Test
    public void test_for_Profile_record_last_name() {
        healthRecord.setLastName("Olamide");
        assertEquals(healthRecord.getLastName().equals("Olamide"), true);
    }

    @Test
    public void test_for_Profile_record_gender() {
        healthRecord.setGender("Female");
        assertEquals(healthRecord.getGender().equals("Female"), true);
    }

    @Test
    public void test_for_Profile_record_birth_day() {
        healthRecord.setBirthDay(18);
        assertEquals(healthRecord.getBirthDay() == 18, true);
    }

    @Test
    public void test_for_Profile_record_birth_month() {
        healthRecord.setBirthMonth(12);
        assertEquals(healthRecord.getBirthMonth() == 12, true);
    }

    @Test
    public void test_for_Profile_record_birth_year() {
        healthRecord.setBirthYear(2015);
        assertEquals(healthRecord.getBirthYear() == 2015, true);
    }

    @Test
    public void test_for_profile_record_leap_year_with_the_birth_year() {
        healthRecord.setBirthDay(29);
        healthRecord.setBirthMonth(2);
        healthRecord.setBirthYear(2001);
        assertEquals(healthRecord.getAge() == 23, true);
    }

    @Test
    public void test_for_Profile_record_height() {
        healthRecord.setHeight(7.5);
        assertEquals(healthRecord.getHeight() == 7.5, true);
    }

    @Test
    public void test_for_profile_record_with_zero_height() {
        healthRecord.setHeight(0);
        assertEquals(Double.POSITIVE_INFINITY, healthRecord.getBodyMassIndex());
    }

    @Test
    public void test_for_profile_record_with_negative_height() {
        healthRecord.setHeight(-68);
        assertEquals(Double.NEGATIVE_INFINITY, healthRecord.getBodyMassIndex());
    }

    @Test
    public void test_for_Profile_record_weight() {
        healthRecord.setWeight(135);
        assertEquals(healthRecord.getWeight() == 135, true);
    }

    @Test
    public void test_for_profile_record_with_zero_weight() {
        healthRecord.setWeight(0);
        assertEquals(Double.POSITIVE_INFINITY, healthRecord.getBodyMassIndex());
    }

    @Test
    public void test_for_profile_record_with_negative_weight() {
        healthRecord.setWeight(-145);
        assertEquals(Double.NEGATIVE_INFINITY, healthRecord.getBodyMassIndex());
    }

    @Test
    public void test_for_Profile_record_Current_age() {
        int currentAge = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentAge - healthRecord.getBirthYear();
        assertEquals(age, healthRecord.getAge());
    }

    @Test
    public void test_profile_record_for_body_mass_index() {
        double bodyMass = (healthRecord.getWeight() * 703) / (healthRecord.getHeight() * healthRecord.getHeight());
        assertEquals(bodyMass, healthRecord.getBodyMassIndex());
    }

    @Test
    public void test_for_profile_record_to_get_the_maximum_heart_rate() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - healthRecord.getBirthYear();
        assertEquals(age, healthRecord.getBodyMassIndex_maximumHeartRate());
    }

    @Test
    public void test_for_profile_record_to_get_the_heart_rate_range() {
        int heartRate = healthRecord.getBodyMassIndex_maximumHeartRate();
        String heartRateRange = String.format("%.0f - %.0f", heartRate * 0.5, heartRate * 0.85);
        assertEquals(heartRateRange, healthRecord.getBodyMassIndex_heartRateRange());
    }
}
