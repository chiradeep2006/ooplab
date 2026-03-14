
class Person {
    String name;
    int age;

  
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Student extends Person {
    int rollNumber;
    String course;


    Student(String name, int age, int rollNumber, String course) {
        super(name, age); 
        this.rollNumber = rollNumber;
        this.course = course;
    }

    void displayStudentDetails() {
        displayPersonInfo();
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}

public class Main9 {
    public static void main(String[] args) {
       
        Student s1 = new Student("Aryan", 20, 101, "Java Programming");

        System.out.println("--- Student Profile ---");
        s1.displayStudentDetails();
    }
}