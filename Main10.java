
class User {
    String name;
    String email;

 
    User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}


class Buyer extends User {
    
   
    Buyer(String name, String email) {
        super(name, email);
    }

    void buyProduct(String item, double price) {
        System.out.println("Buyer " + name + " (" + email + ") purchased: " + item + " for $" + price);
    }
}


class Seller extends User {
    

    Seller(String name, String email) {
        super(name, email);
    }

    void listProduct(String item, double price) {
        System.out.println("Seller " + name + " (" + email + ") listed: " + item + " for sale at $" + price);
    }
}


public class Main10 {
    public static void main(String[] args) {
        // Creating objects using constructors
        Buyer b = new Buyer("Alice", "alice@example.com");
        Seller s = new Seller("Bob", "bob@shop.com");

        // Calling transaction methods
        s.listProduct("Laptop", 899.99);
        b.buyProduct("Laptop", 899.99);
    }
}