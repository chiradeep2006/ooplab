import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int correctPin = 1234;
        int enteredPin;

                do {
            System.out.print("Enter your 4-digit payment PIN: ");
            enteredPin = input.nextInt();

            if (enteredPin != correctPin) {
                System.out.println("Incorrect PIN. Access Denied. Try again.");
            }
            
        } while (enteredPin != correctPin); 


        System.out.println("PIN Verified. Payment Processed Successfully!");
        
        input.close();
    }
}