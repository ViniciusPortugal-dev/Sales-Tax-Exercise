# Sales Tax Calculator

This project implements a simple sales tax calculator, which reads input from Main.java and produces output in the console. The program takes in information on items that are being purchased and calculates the sales tax on each item based on whether it is exempt or imported, and then prints a receipt with the total sales tax and total cost of the items.

The program is written in Java and includes the following files:

**Main.java**: This file contains the main method that creates three different shopping carts, adds items to each cart, creates a receipt for each cart, and then prints out the receipts.

**Receipt.java**: This file contains a class that takes a shopping cart and calculates the total cost and sales tax for each item in the cart. It then prints out a formatted receipt with the total sales tax and total cost of the items.

**ShoppingCart.java**: This file contains a class that holds a list of items and a tax calculator. It provides methods to add items to the cart and to get the list of items in the cart.

**TaxCalculator.java**: This file contains a class that calculates the sales tax on an item based on whether it is exempt or imported.

**Item.java**: This file contains a class that represents an item in a shopping cart. It contains information about the item's name, price, exemption status, and import status.

## How to use
To run the program, simply compile and run the Main.java file using the following commands:
`javac Main.java
java Main`

## Testing

To run the JUnit test, simply run the ItemTest.java file using your favorite IDE

**ItemTest.java**: This file contains a JUnit test for the getFormattedName method in the Item class.

**ShoppingCartTest.java**: This file contains a JUnit test for the ShoppingCart class. It tests the add item method to ensure that items are properly added to the shopping cart and that the total cost of the cart is calculated correctly.

**TaxCalculatorTest.java**: This file contains a JUnit test for the TaxCalculator class. It tests the calculate tax method to ensure that the sales tax is calculated correctly for exempt and imported items.
