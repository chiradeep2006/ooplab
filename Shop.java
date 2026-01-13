import java.util.Scanner;
public class Shop 
{
public static void main (String [] args)
{
Scanner scanner=new Scanner (System.in);
String item;
double price;
int quantity;
int num;
char currency='$';
double total;
System.out.print("What item would you like to buy?:");
item=scanner.nextLine();
System.out.print("What is the price for each?:");
price=scanner.nextDouble();
System.out.print("How many would you like?:");
quantity=scanner.nextInt();
System.out.print("you have bought " + quantity +  item );
total=price*quantity;
System.out.print(" Your total is "+ currency +total);
scanner.close();
}
}