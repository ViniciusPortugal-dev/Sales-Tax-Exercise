package calculator;

public class Receipt {
    private final ShoppingCart shoppingCart;

    public Receipt(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void printReceipt(int outputNumber) {
        int i = 1;
        System.out.println("Output " + outputNumber + ":");

        for (Item item : shoppingCart.getItems()) {
            double tax = TaxCalculator.calculateSalesTax(item);
            double price = item.getPrice() + tax;

            System.out.println(item.toString() + ": " + String.format("%.2f", price));
        }

        double totalTax = shoppingCart.getItems().stream()
                .mapToDouble(TaxCalculator::calculateSalesTax)
                .sum();

        double totalPrice = shoppingCart.getItems().stream()
                .mapToDouble(Item::getPrice)
                .sum() + totalTax;

        System.out.println("Sales Taxes: " + String.format("%.2f", totalTax));
        System.out.println("Total: " + String.format("%.2f", totalPrice));
        System.out.println();
    }

}