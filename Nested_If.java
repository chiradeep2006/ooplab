public class Nested_If {

    public static void main(String[] args) {
        boolean isstudent = false;
        boolean issenior = false;
        double price = 1000; 

        if (isstudent) {

            if (issenior) {
                System.out.println("Student and Senior: Applying both offers");
                price *= 0.70; 
            } else {
                System.out.println("Student offer 20%");
                price *= 0.80;
            }
        } 
        else {

            if (issenior) {
                System.out.println("Senior offer 10%");
                price *= 0.90;
            } else {
                System.out.println("No discount applied");
                price *= 1;
            }
        }

        System.out.printf("The price of the ticket: %.2f", price);
    }
}