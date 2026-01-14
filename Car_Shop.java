import java.util.Scanner;
public class Car_Shop {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in) ;
        String carname;
        double baseprice;
        int stockcount;
        double tax;
        double finalprice;
        System.out.print("Name of the car:");
        carname=scanner.nextLine();
        System.out.print("Price of the car:");
        baseprice=scanner.nextDouble();
        System.out.print("Total number of car:");
        stockcount=scanner.nextInt();
        System.out.print("Tax applied:");
        tax=scanner.nextDouble();
        finalprice=baseprice*tax;
        System.out.print("The price of the car:" + finalprice );
        scanner.close();    }
    
}