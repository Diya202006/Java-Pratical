class Student {
    static String collegeName;
    String studentName;

    static {
        collegeName = "ABC Engineering College";
        System.out.println("Static Block Executed: College Name Set");
    }

    Student(String name) {
        studentName = name;
    }

    static void displayCollege() {
        System.out.println("College Name: " + collegeName);
    }

    void displayStudent() {
        System.out.println("Student Name: " + studentName);
    }
}

public class StaticDemo {
    public static void main(String[] args) {

        Student.displayCollege();

        Student s1 = new Student("Rahul");
        Student s2 = new Student("Anita");

        s1.displayStudent();
        s2.displayStudent();
    }
}
