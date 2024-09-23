package Chapter2.From_python_Dietel_to_java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Investment_returnTest {

    private Investment_Return investmentCalculator;

    @BeforeEach
    public void setup(){
        investmentCalculator = new Investment_Return();
    }

    @Test
    public void test() {
        double principal = 1000;
        double rate = 0.07;
        int years = 10;
    }

    @Test
    public void Calculate_money_invested_returns_for_ten_years() {
        double principal = 1000;
        double rate = 0.07;
        int years = 10;
        double calculate = investmentCalculator.calculate_money_invested(principal, rate, years);
        assertEquals(calculate, 1967.1513572895665);
    }

    @Test
    public void Calculate_money_invested_returns_for_twenty_years() {
        double principal = 1000;
        double rate = 0.07;
        int years = 20;
        double calculate = investmentCalculator.calculate_money_invested(principal, rate, years);
        assertEquals(calculate, 3869.6844624861833);
    }

    @Test
    public void Calculate_money_invested_returns_for_thirty_years() {
        double principal = 1000;
        double rate = 0.07;
        int years = 30;
        double calculate = investmentCalculator.calculate_money_invested(principal, rate, years);
        assertEquals(calculate, 7612.255042662042);
    }

    @Test
    public void Calculate_money_invested_returns_for_fifty_years() {
        double principal = 1000;
        double rate = 0.07;
        int years = 50;
        double calculate = investmentCalculator.calculate_money_invested(principal, rate, years);
        assertEquals(calculate, 29457.025063071407);
    }
}
