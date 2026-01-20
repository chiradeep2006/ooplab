import java.util.Scanner;

public class Auto_Service {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        double basePrice = 50.0;
        double totalPrice = 0;
        boolean isPremiumMember = true; 

        System.out.println("--- Welcome to Elite Auto Service ---");
        System.out.println("1. Oil Change ($30)");
        System.out.println("2. Tire Rotation ($20)");
        System.out.println("3. Engine Diagnostics ($100)");
        System.out.println("4. Full Car Wash ($15)");
        System.out.print("Please enter your choice (1-4): ");
        
        int serviceChoice = scanner.nextInt();

        switch (serviceChoice) {
            case 1:
                System.out.println("Selected: Oil Change");
                totalPrice = basePrice + 30.0;
                break;
            case 2:
                System.out.println("Selected: Tire Rotation");
                totalPrice = basePrice + 20.0;
                break;
            case 3:
                System.out.println("Selected: Engine Diagnostics");
                totalPrice = basePrice + 100.0;
                break;
            case 4:
                System.out.println("Selected: Full Car Wash");
                totalPrice = basePrice + 15.0;
                break;
            default:
                System.out.println("Invalid Choice");
                totalPrice = 0;
                break; 
        }

        
        if (totalPrice > 0 && isPremiumMember) {
            System.out.println("Premium Member detected! Applying $5 discount...");
            totalPrice -= 5.0;
        }

        System.out.printf("Final Total Price: $%.2f\n", totalPrice);
        System.out.println("--------------------------------------");
        
        scanner.close();
    }
}