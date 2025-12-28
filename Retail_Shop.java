class Retail_Shop{
public static void main(String args[])
{
int itema=100,itemb=200,itemc=300;
double price;
price=((itema*2)+(itemb)+(itemc*3));
price=price-(.1*price);
price=price+(0.05*price);
System.out.println(price);
}
}