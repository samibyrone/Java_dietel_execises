package Chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountDuplicatedCodeTest {

    private AccountDuplicatedCode account;

    @BeforeEach
    public void setUp() {
        account = new AccountDuplicatedCode("joseph grey", 100.00);
    }

    @Test
    public void test_to_initiate_account_With_balance() {
        account.setName("Philip Morgan");
        account.setBalance(100.00);
        assertEquals(account.getName(), "Philip Morgan");
        assertEquals(account.getBalance(), 100.00);
    }

    @Test
    public void test_to_initiate_account_and_validate_account_with_account_name() {
        account.setName("Philip Morgan");
        assertEquals(account.getName(), "Philip Morgan");
        account.setName("Samson Ibironke");
        assertEquals(account.getName(), "Samson Ibironke");
    }

    @Test
    public void test_to_deposit_into_account_With_balance() {
        account.setBalance(100.00);
        account.deposit(500.00);
        assertEquals(account.getBalance(), 600.00);
    }

    @Test
    public void test_to_deposit_negative_amount_into_account_With_balance() {
        account.setBalance(500.00);
        account.deposit(-1500.00);
        assertEquals(account.getBalance(), 500.00);
    }

}
