public class Main11 {
    public static void main(String[] args) {
        boolean userCancelled = true; 

        System.out.println("Search started...");

        for (int radius = 1; radius <= 10; radius++) {
    
            if (userCancelled) {
                System.out.println("!! User cancelled the request. Stopping search...");
                break; 
            }

            System.out.println("Checking " + radius + "km radius...");
            
           
            if (radius == 4) {
                System.out.println("Driver found!");
                break; 
            }
        }

        System.out.println("System cleanup complete.");
    }
}