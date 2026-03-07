class animal{
 String sound;
animal(String sound){
           this.sound=sound;
}
void makesound(){
    System.out.println("animal says"+sound);
}
}
class dog extends animal{
 dog(){
super("bark");
}
}
class cat extends animal{
cat(){
super("meow");
}
}
public class inheritance{
public static void main (String[] args){
animal d=new dog();
animal c=new cat();
d.makesound();
c.makesound();
}
}
