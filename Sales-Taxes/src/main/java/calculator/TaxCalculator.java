package calculator;



public class TaxCalculator {
    private static final double BASIC_SALES_TAX_RATE = 0.1;
    private static final double IMPORT_DUTY_RATE = 0.05;
    private static final double ROUNDING_FACTOR = 0.05;

    public static double calculateSalesTax(Item item) {
        double tax = 0;

        if (!item.isExempt()) {
            tax += item.getPrice() * BASIC_SALES_TAX_RATE;
        }

        if (item.isImported()) {
            tax += item.getPrice() * IMPORT_DUTY_RATE;
        }

        return roundTax(tax);
    }

    private static double roundTax(double tax) {
        return Math.ceil(tax / ROUNDING_FACTOR) * ROUNDING_FACTOR;
    }
}
