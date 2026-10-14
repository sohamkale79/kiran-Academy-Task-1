
public class ShoppingBill {

    // Step 1: Calculate 18% GST on Electronics
    public static double calculateElectronicsGST(double a, double b) {
        double amount = a + b;
        double gst = amount * 18 / 100;
        return amount + gst;
    }

    // Step 2: Calculate 13% GST on Fashion
    public static double calculateFashionGST(double c, double d) {
        double amount = c + d;
        double gst = amount * 13 / 100;
        return amount + gst;
    }

    // Step 3: Calculate 7% GST on Food
    public static double calculateFoodGST(double e) {
        double gst = e * 7 / 100;
        return e + gst;
    }

    // Step 4: Calculate total bill after GST
    public static double totalBill(double a, double b,
                                   double c, double d, double e) {

        double electronics = calculateElectronicsGST(a, b);
        double fashion = calculateFashionGST(c, d);
        double food = calculateFoodGST(e);

        return electronics + fashion + food;
    }

    // Step 5: Calculate 20% discount and final payable amount
    public static double calculateDiscountedBill(double a, double b,
                                                  double c, double d, double e) {

        double total = totalBill(a, b, c, d, e);
        double discount = total * 20 / 100;

        return total - discount;
    }

    public static void main(String[] args) {

        // Sample values given in the task
        double a = 100;
        double b = 100;
        double c = 100;
        double d = 100;
        double e = 100;

        double total = totalBill(a, b, c, d, e);
        double discount = total * 20 / 100;
        double finalAmount = calculateDiscountedBill(a, b, c, d, e);

        System.out.printf("Total after GST = %.2f%n", total);
        System.out.printf("Discount = %.2f%n", discount);
        System.out.printf("Final payable amount = %.2f%n", finalAmount);
    }
}
