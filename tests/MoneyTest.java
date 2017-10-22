package money;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
    @Test
    public void testMultiplication(){
        money.Dollar five = new money.Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}