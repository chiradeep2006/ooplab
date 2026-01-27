public class Do_While {
    public static void main(String[] args) {
        int count = 1;

        do {
            System.out.println("Repairing car part #" + count);
            count++; 
            
        } while (count <= 3); 

        System.out.println("Maintenance complete!");
    }
}