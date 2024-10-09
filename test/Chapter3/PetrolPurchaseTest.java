package Chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PetrolPurchaseTest {

    private PetrolPurchase petrol;

    @BeforeEach
    public void setUp() {
        petrol = new PetrolPurchase("Lagos", "Black-Market", 100, 1200.0, 0.08);
    }

    @Test
    public void test_for_petrol_purchase() {
        petrol.setLocation("Abuja");
        petrol.setPetrolType("Filling-Station");
        petrol.setQuantity(200);
        petrol.setPrice(800.0);
        petrol.setPriceDiscount(0.06);
    }

    @Test
    public void test_that_petrol_can_be_purchase() {
        petrol.setLocation("Abeokuta");
        petrol.setPetrolType("Filling-station");
        petrol.setQuantity(500);
        petrol.setPrice(850.0);
        petrol.setPriceDiscount(0.08);
        assertEquals("Abeokuta", petrol.getLocation());
        assertEquals("Filling-station", petrol.getPetrolType());
        assertEquals(500, petrol.getQuantity());
        assertEquals(850.0, petrol.getPrice());
        assertEquals(0.08, petrol.getPriceDiscount());
    }

    private void purchase() {
        petrol.setLocation("Abuja");
        petrol.setPetrolType("Regular");
        petrol.setQuantity(200);
        petrol.setPrice(800.0);
        petrol.setPriceDiscount(0.06);
    }

    @Test
    public void test_the_location_for_petrol_purchase() {
        purchase();
        assertNotEquals("Lagos", petrol.getLocation());
    }

    @Test
    public void test_for_the_type_of_petrol_purchase() {
        purchase();
        assertNotEquals("Lagos", petrol.getLocation());
        petrol.setLocation("Abeokuta");
        assertEquals("Abeokuta", petrol.getLocation());
    }

    @Test
    public void test_for_the_quantity_of_petrol_purchase() {
        purchase();
        assertNotEquals(100, petrol.getQuantity());
        petrol.setQuantity(5000);
        assertEquals(5000, petrol.getQuantity());
    }

    @Test
    public void test_for_the_price_per_liter_of_petrol_purchase() {
        purchase();
        assertNotEquals(500.0, petrol.getPrice(), 0.0);
        petrol.setPrice(1000.0);
        assertEquals(1000.0, petrol.getPrice());
    }

    @Test
    public void test_for_the_price_discount_on_each_of_petrol_purchase() {
        purchase();
        assertNotEquals(0.05, petrol.getPriceDiscount(), 0.0);
        petrol.setPriceDiscount(0.10);
        assertEquals(0.10, petrol.getPriceDiscount());
    }

    @Test
    public void test_to_calculate_petrol_purchase_amount() {
        purchase();
        double amount = 200 * 800 * (1 - 0.06 / 100);
        assertEquals(petrol.getPurchasePrice(), amount);
    }

    @Test
    public void test_to_calculate_zero_discount_on_each_of_petrol_purchase() {
        purchase();
        petrol.setPriceDiscount(0.00);
        double amount = 200 * 800.0 * (1 - 0.00 / 100);
        assertEquals(petrol.getPurchasePrice(), amount);
    }

    @Test
    public void test_to_check_for_negative_discount() {
        purchase();
        petrol.setPriceDiscount(-0.20);
        double amount = 200 * 800.0 * (1 - (-0.20 / 100));
        assertEquals(petrol.getPurchasePrice(), amount);
    }

    @Test
    public void test_to_check_for_negative_price_on_each_of_petrol_purchase() {
        purchase();
        petrol.setPrice(-800.0);
        double amount = 200 * -800.0 * (1 - 0.06 / 100);
        assertEquals(petrol.getPurchasePrice(), amount);
    }
}
