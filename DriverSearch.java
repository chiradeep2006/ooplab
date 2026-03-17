public class DriverSearch {
    public static void main(String[] args) {
        boolean driverFound = false;
        int radius = 1;
        int maxRadius = 5;

        System.out.println("Starting search for nearby drivers...");

       
        while (!driverFound && radius <= maxRadius) {
            System.out.println("Searching in a " + radius + "km radius...");

           
            if (radius == 3) {
                driverFound = true;
                System.out.println(">> Driver located at " + radius + "km!");
            }

      
            radius++;
        }


        if (driverFound) {
            System.out.println("Status: Driver assigned and en route.");
        } else {
            System.out.println("Status: No drivers available within " + maxRadius + "km.");
        }
    }
}