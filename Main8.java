
class SportsShop {
    String shopName = "Global Sports Arena";

    void displayWelcome() {
        System.out.println("Welcome to " + shopName);
        System.out.println("We provide high-quality sports gear.");
    }
}


class CricketSection extends SportsShop {
    String category = "Cricket Equipment";

    void showCategory() {
        System.out.println("Section: " + category);
    }

    void listItems() {
        System.out.println("Items available: Bats, Balls, Gloves, Pads.");
    }
}

public class Main8 {
    public static void main(String[] args) {
       
        CricketSection myShop = new CricketSection();

                myShop.displayWelcome();


        myShop.showCategory();
        myShop.listItems();
    }
}