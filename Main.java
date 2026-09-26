public class Main {
    public static void main(String[] args) {
        // Variables for item price and sales tax rate (5%)
        double itemPrice = 49.99;
        double SALES_TAX_RATE = 0.05; // 5% sales tax rate
        double salesTax = 0.0;
        double totalPrice = 0.0;

        // Calculations
        salesTax = itemPrice * SALES_TAX_RATE;
        totalPrice = itemPrice + salesTax;

        // Output results
        System.out.println("The purchase price of the item is: $" + itemPrice);
        System.out.println("The computed 5% sales tax is: $" + salesTax);
        System.out.println("The total price including tax is: $" + totalPrice);
    }
}