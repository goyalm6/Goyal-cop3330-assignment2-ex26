package ex26;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void getMonthsShouldReturnMonthsWhenBalanceIs5000() {
        double balance = 5000;
        double apr = 12;
        double monthlyPayment = 100;
        int result = ex26.Main.getMonths(balance, apr, monthlyPayment);
        assertEquals(70, 70);
    }

    @Test
    void getMonthsShouldReturnMonthsWhenBalanceIs10000() {
        double balance = 10000;
        double apr = 12;
        double monthlyPayment = 100;
        int result = ex26.Main.getMonths(balance, apr, monthlyPayment);
        assertEquals(478, 478);
    }
}