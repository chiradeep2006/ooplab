public class ExceptionExample {
    public static void main(String[] args) {
        try {
            // Code that might throw an exception
            int dividend = 10;
            int divisor = 0;
            int result = dividend / divisor; 
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            // This block executes only if an ArithmeticException occurs
            System.err.println("Error: Cannot divide by zero!");
            System.err.println("Message: " + e.getMessage());
            
        } catch (Exception e) {
            // Generic catch block for any other unexpected errors
            System.err.println("An unexpected error occurred: " + e.getMessage());
            
        } finally {
            // This block ALWAYS executes, regardless of an exception
            System.out.println("Cleanup: Closing resources or finishing execution.");
        }
    }
}