public class inheritance{
    public static void main(String[] args) {
        
        Fournumcalculator calc = new Fournumcalculator(10, 20, 30, 40);

                int sumTwo = calc.ta(); 
        System.out.println("Sum of first two numbers (a + b): " + sumTwo);

        
        int sumThree = calc.tha();
        System.out.println("Sum of first three numbers (a + b + c): " + sumThree);
        int sumFour = calc.fa();
        System.out.println("Sum of all four numbers (a + b + c + d): " + sumFour);
        
        System.out.println("\nCalculation successful using Multi-level Inheritance.");
    }
}