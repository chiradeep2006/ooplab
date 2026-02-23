class user{
  String username;
  String email;
  int age;
user(String username, String email,int age){
         this.username=username;
         this.email=email;
         this.age=age;
}
}
public class Main2{
public static void main (String[]args){
 user user1=new user("iuhuhu","tyjtyj",29 );
System.out.println(user1.username);
System.out.println(user1.email);
System.out.println(user1.age);
}
}