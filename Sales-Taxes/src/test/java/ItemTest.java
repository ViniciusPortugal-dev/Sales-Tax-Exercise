
import calculator.Item;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {
    @Test
    public void testGetFormattedName() {
        Item item1 = new Item("book", 12.49, true, false);
        assertEquals("book", item1.getFormattedName());

        Item item2 = new Item("music CD", 14.99, false, false);
        assertEquals("music CD", item2.getFormattedName());

        Item item3 = new Item("box of chocolates", 10.0, true, true);
        assertEquals("imported box of chocolates", item3.getFormattedName());

        Item item4 = new Item("bottle of perfume", 47.5, false, true);
        assertEquals("imported bottle of perfume", item4.getFormattedName());
    }
}
