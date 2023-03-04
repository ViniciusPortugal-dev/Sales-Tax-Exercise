

import calculator.Item;
import calculator.Receipt;
import calculator.ShoppingCart;
import calculator.TaxCalculator;

public class Main {
    public static void main(String[] args) {
        // Input 1
        ShoppingCart cart1 = new ShoppingCart(new TaxCalculator());
        cart1.addItem(new Item("book", 12.49, true, false));
        cart1.addItem(new Item("music CD", 14.99, false, false));
        cart1.addItem(new Item("chocolate bar", 0.85, true, false));
        Receipt receipt1 = new Receipt(cart1);
        receipt1.printReceipt(1);

        // Input 2
        ShoppingCart cart2 = new ShoppingCart(new TaxCalculator());
        cart2.addItem(new Item("imported box of chocolates", 10.0, true, true));
        cart2.addItem(new Item("imported bottle of perfume", 47.5, false, true));
        Receipt receipt2 = new Receipt(cart2);
        receipt2.printReceipt(2);

        // Input 3
        ShoppingCart cart3 = new ShoppingCart(new TaxCalculator());
        cart3.addItem(new Item("imported bottle of perfume", 27.99, false, true));
        cart3.addItem(new Item("bottle of perfume", 18.99, false, false));
        cart3.addItem(new Item("packet of headache pills", 9.75, true, false));
        cart3.addItem(new Item("imported box of chocolates", 11.25, true, true));
        Receipt receipt3 = new Receipt(cart3);
        receipt3.printReceipt(3);
    }
}
