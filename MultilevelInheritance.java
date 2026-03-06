import java.util.Scanner;

class Student {
    int roll_no;

    void getRoll() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        roll_no = sc.nextInt();
    }

    void displayRoll() {
        System.out.println("Roll Number: " + roll_no);
    }
}

class Test extends Student {
    int sub1, sub2;

    void getMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of Subject 1: ");
        sub1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        sub2 = sc.nextInt();
    }
}

class Result extends Test {
    void displayResult() {
        int total = sub1 + sub2;

        displayRoll();
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);
        System.out.println("Total Marks: " + total);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Result r = new Result();

        r.getRoll();
        r.getMarks();
        r.displayResult();
    }
}