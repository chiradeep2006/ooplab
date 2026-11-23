
import java.util.*;

class Student {
    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public double getMarks() {
        return marks;
    }

    public void display() {
        System.out.println(id + " | " + name + " | " + marks);
    }
}

public class Main {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Sort by Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1 -> addStudent();
                    case 2 -> displayStudents();
                    case 3 -> searchStudent();
                    case 4 -> sortStudents();
                    case 5 -> deleteStudent();
                    case 6 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid choice!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
                choice = 0;
            }

        } while (choice != 6);

        sc.close();
    }

    static void addStudent() {
        System.out.print("Enter ID: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = Double.parseDouble(sc.nextLine());

        students.add(new Student(id, name, marks));
        System.out.println("Student Added Successfully!");
    }

    static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }

        for (Student s : students) {
            s.display();
        }
    }

    static void searchStudent() {
        System.out.print("Enter ID to search: ");
        int id = Integer.parseInt(sc.nextLine());

        for (Student s : students) {
            if (s.getId() == id) {
                s.display();
                return;
            }
        }

        System.out.println("Student not found!");
    }

    static void sortStudents() {
        students.sort(
            Comparator.comparingDouble(Student::getMarks).reversed()
        );

        System.out.println("Sorted by highest marks:");
        displayStudents();
    }

    static void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        int id = Integer.parseInt(sc.nextLine());

        boolean removed = students.removeIf(s -> s.getId() == id);

        System.out.println(removed
            ? "Student Deleted!"
            : "Student not found!");
    }
}
