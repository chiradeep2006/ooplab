abstract class vehicle{
    abstract void start();
    void stop (){
        System.out.println("THE VEHICLE IS STOPPING ");
    }
}
class scooter extends vehicle{
    void start(){
        System.out.println("THE SCOOTER IS RUNNING");
    }
}
public class Abs {

    public static void main(String[] args) {
        scooter s=new scooter();
        s.start();
        s.stop();
    }
}