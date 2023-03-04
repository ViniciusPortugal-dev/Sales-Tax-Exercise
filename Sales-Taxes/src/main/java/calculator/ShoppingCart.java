package calculator;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Item> items;
    private final TaxCalculator taxCalculator;

    public ShoppingCart(TaxCalculator taxCalculator) {
        this.items = new ArrayList<>();
        this.taxCalculator = taxCalculator;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public TaxCalculator getTaxCalculator() {
        return taxCalculator;
    }


}
