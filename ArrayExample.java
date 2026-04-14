public class ArrayExample {
    public static void main(String[] args) {
        // 1. Declaration and Initialization
        // Creating an array of integers with a size of 5
        int[] numbers = {10, 20, 30, 40, 50};

        // 2. Accessing Elements
        System.out.println("First element: " + numbers[0]); 
        System.out.println("Array length: " + numbers.length);

        // 3. Modifying an element
        numbers[2] = 100; // Changing 30 to 100

        // 4. Traversing the array using a for-each loop
        System.out.println("\nIterating through the array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // 5. Calculating the sum of elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        System.out.println("\n\nSum of array elements: " + sum);
    }
}