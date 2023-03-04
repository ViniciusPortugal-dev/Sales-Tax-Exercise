

import calculator.Item;
import calculator.TaxCalculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class TaxCalculatorTest {
    @Test
    public void testCalculateSalesTax() {
        TaxCalculator calculator = new TaxCalculator();

        Item item1 = new Item("book", 12.49, true, false);
        assertEquals(0.0, TaxCalculator.calculateSalesTax(item1), 0.001);

        Item item2 = new Item("music CD", 14.99, false, false);
        assertEquals(1.5, TaxCalculator.calculateSalesTax(item2), 0.001);

        Item item3 = new Item("imported box of chocolates", 10.0, true, true);
        assertEquals(0.5, TaxCalculator.calculateSalesTax(item3), 0.001);

        Item item4 = new Item("imported bottle of perfume", 47.5, false, true);
        assertEquals(7.15, TaxCalculator.calculateSalesTax(item4), 0.001);
    }
}
