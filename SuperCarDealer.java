public class SuperCarDealer {
    public static void main(String[] args) {
        boolean isCarInStock = true;
        int customerBudget = 150000;
        boolean hasTradeIn = true;
        int tradeInValue = 20000;
        int carPrice = 100000;
        if (isCarInStock) {
            if (customerBudget >= carPrice) {
                System.out.println("Standard Purchase Approved! Welcome to the club.");
            } 
            else {
                if (hasTradeIn && (customerBudget + tradeInValue >= carPrice)) {
                    System.out.println("Purchase approved via Trade-in! Your total value is: $" + (customerBudget + tradeInValue));
                } 
                else {
                    System.out.println("Insufficient funds. Even with a trade-in, you are short by: $" + (carPrice - (customerBudget + tradeInValue)));
                }
            }
        } 
        else {
            System.out.println("Sorry, we have nothing to sell right now.");
        }
    }
}