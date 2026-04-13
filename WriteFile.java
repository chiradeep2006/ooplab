import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt");
            fw.write("Hello, this is file handling in Java");
            fw.close();
            System.out.println("File written successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}