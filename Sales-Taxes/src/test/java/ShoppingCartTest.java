
import calculator.Item;
import calculator.ShoppingCart;
import calculator.TaxCalculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShoppingCartTest {

    @Test
    public void testGetItems() {
        ShoppingCart cart = new ShoppingCart(new TaxCalculator());

        Item item1 = new Item("book", 12.49, true, false);
        cart.addItem(item1);

        Item item2 = new Item("music CD", 14.99, false, false);
        cart.addItem(item2);

        assertEquals(cart.getItems().size(), 2);
        assertTrue(cart.getItems().contains(item1));
        assertTrue(cart.getItems().contains(item2));
    }

    @Test
    public void testAddItem() {
        ShoppingCart cart = new ShoppingCart(new TaxCalculator());

        Item item1 = new Item("book", 12.49, true, false);
        cart.addItem(item1);

        assertEquals(cart.getItems().size(), 1);
        assertTrue(cart.getItems().contains(item1));

        Item item2 = new Item("music CD", 14.99, false, false);
        cart.addItem(item2);

        assertEquals(cart.getItems().size(), 2);
        assertTrue(cart.getItems().contains(item2));
    }

    @Test
    public void testGetTaxCalculator() {
        TaxCalculator taxCalculator = new TaxCalculator();
        ShoppingCart cart = new ShoppingCart(taxCalculator);

        assertEquals(cart.getTaxCalculator(), taxCalculator);
    }
}
