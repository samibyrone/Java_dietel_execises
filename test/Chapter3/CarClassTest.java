package Chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarClassTest {

    private CarClass carClass;

    @BeforeEach
    public void setup() {
        carClass = new CarClass("Toyota", "2015", 1500000);
    }

    @Test
    public void testForCar_model_price_and_year() {
        carClass.setModel("Toyota-Corolla");
        carClass.setYear("2022");
        carClass.setPrice(1500000);
        assertTrue(carClass.getModel().equals("Toyota-Corolla"));
        assertTrue(carClass.getYear().equals("2022"));
        assertTrue(carClass.getPrice() == 1500000);
    }

    @Test
    public void test_car_for_invalid_price() {
        carClass.setModel("Range-Rovers");
        carClass.setYear("2022");
        carClass.setPrice(-25000000);
        assertFalse(carClass.getPrice() == 25000000);
    }

    @Test
    public void test_car_for_invalid_year() {
        carClass.setModel("Ferrari");
        carClass.setYear("2022");
        carClass.setPrice(4500000);
        assertFalse(carClass.getYear().equals("2025"));
    }

    @Test
    public void test_car_for_invalid_model() {
        carClass.setModel("Bugatti");
        carClass.setYear("2025");
        carClass.setPrice(17500000);
        assertFalse(carClass.getModel().equals("Range-Rovers"));
    }

    @Test
    public void test_car_for_discount_on_purchase() {
        carClass.setModel("Mercedes-Benz");
        carClass.setYear("2024");
        carClass.setPrice(6500000);
        carClass.priceDiscount(7);
        assertTrue(carClass.getPrice() == 6045000);
        carClass.priceDiscount(5);
        assertTrue(carClass.getPrice() == 5742750);
    }


}