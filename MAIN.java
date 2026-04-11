 interface Flyer {
void fly ();
}
 interface Swimmer {
void swim ();
}
class Duck implements Flyer,Swimmer {
    @Override
public void fly(){
    System.out.println("DUCK FLYS");
}
@Override
    public void swim(){
        System.out.println("DUCK SWIMS");
    }
}
public class MAIN{
    public static void main(String[]args){
        Duck d = new Duck();
        d.fly();
        d.swim();
    }
}
   

