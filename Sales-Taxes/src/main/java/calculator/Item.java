package calculator;


public class Item {
    private final String name;
    private final double price;
    private final boolean isExempt;
    private final boolean isImported;

    public Item(String name, double price, boolean isExempt, boolean isImported) {
        this.name = name;
        this.price = price;
        this.isExempt = isExempt;
        this.isImported = isImported;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isExempt() {
        return isExempt;
    }

    public boolean isImported() {
        return isImported;
    }

    public String getFormattedName() {
        String formattedName = name;
        if (isImported()) {
            formattedName = "imported " + formattedName;
        }

        return formattedName;
    }



    @Override
    public String toString() {
        return "1 " + name;
    }
}

