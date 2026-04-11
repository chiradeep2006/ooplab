 class Bank_Account {
    double balance=5000.0;
    void deposit (int amount){
      balance+=amount;
      System.out.println("the amt added:"+amount);
      System.out.println("updated balance:"+balance);
    }
    void cheque_deposit (int amount,String chn){
        balance+=amount;
        System.out.println("the amt deposited in chq num:"+chn+"of amt:"+amount);
        System.out.println("updated bal:"+balance);
    }
    void online_transfer (int amount,long trid) {
       balance+=amount;
       System.out.println("the amt deposite in id:"+trid+"of amt:"+amount);
       System.out.println("updated balance"+balance);
    }
    
}
public class Overload {
    public static void main(String[] args) {
        Bank_Account ba=new Bank_Account();
        ba.deposit(5000);
        ba.cheque_deposit(5000, "123fdfb234");
        ba.online_transfer(123456,1233435474);
    }
}