public class l {
    public static void main(String[] args) {
        double tirePrice = 85.50;
        double totalCost = 0;

        System.out.println("--- Processing Tire Order ---");

       
        for (int i = 1; i <= 5; i++) {
            totalCost += tirePrice;
            System.out.println("Item #" + i + " added. Subtotal: ₹" + totalCost);
        }

        System.out.printf("\nFinal Bill for 5 tires: ₹%.2f\n", totalCost);
        System.out.println("Order Processed Successfully.");
    }
}