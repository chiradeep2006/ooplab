public class SWITCH_CASE {

    public static void main(String[] args) {
        String day="chiradeep";
        switch (day) {
            case "sunday":System.out.println("it is a sunday");
                break;
             case "monday":System.out.println("it is a monday");
                break;
                case "tuesday":System.out.println("it is a tuesday");
                break;
                case "thursday":System.out.println("it is a thursday");
                break;
                case "friday":System.out.println("it is a friday");
                break;
                case "saturday":System.out.println("it is a saturday");
                break;
                case "wednesday":System.out.println("it is a wednesday");
                break;      
            default:System.out.println("it is not a day");
                break;
        }
    }
}