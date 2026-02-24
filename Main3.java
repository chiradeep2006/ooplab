class user{
  String username;
  String email;
  int age;
public user(){
         this.username="username";
         this.email="email";
         this.age=7;
}
}
public class Main3{
public static void main (String[]args){
 user user1=new user();
System.out.println(user1.username);
System.out.println(user1.email);
System.out.println(user1.age);
}
}