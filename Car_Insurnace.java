import java.util.Scanner;

public class Car_Insurnace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a repair cost: ");
        int repaircost = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Insurance type (Gold/Silver/None): ");
        String insurancetype = scanner.nextLine(); 
        System.out.print("Is it an emergency? (true/false): ");
        boolean isemergency = scanner.nextBoolean();
        if (insurancetype.equalsIgnoreCase("Gold")) {
            System.out.println("Cost after Gold discount: " + (repaircost * 0.90));
        } 
        else if (insurancetype.equalsIgnoreCase("Silver")) {
            System.out.println("Cost after Silver discount: " + (repaircost * 0.50));
        } 
        else {
            System.out.println("No Discount Applied. Total: " + repaircost);
        }
        if (isemergency) {
            System.out.println("Emergency Status: Extra Payment Required (+ $200)");
        } else {
            System.out.println("Emergency Status: No Extra Payment");
        }

        scanner.close();
    }
}