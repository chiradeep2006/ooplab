class CarPart {
    String partName;
    double price;

        public CarPart(String name, double p) {
        partName = name;
        price = p;
        System.out.println("New part added to inventory: " + partName);
    }

    void displayDetails() {
        System.out.println("Part: " + partName + " | Price: ₹" + price);
    }
}

public class Main5 {
    public static void main(String[] args) {
        
        CarPart tire = new CarPart("Spare Tire", 85.00);
        CarPart engineOil = new CarPart("Synthetic Oil", 45.50);

        tire.displayDetails();
        engineOil.displayDetails();
    }
}