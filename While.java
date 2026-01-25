import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String response = "";

        while (!response.equals("q")) {
            System.out.print("Enter q to end: ");
            response = scanner.nextLine();
        }

        scanner.close();
        System.out.println("THE LOOP ENDS!");
    }
}