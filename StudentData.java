import java.io.*;
import java.util.Scanner;

public class StudentData {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Accept student data
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Weight: ");
            float weight = sc.nextFloat();

            System.out.print("Enter Height: ");
            float height = sc.nextFloat();
            sc.nextLine();  // clear buffer

            System.out.print("Enter City: ");
            String city = sc.nextLine();

            System.out.print("Enter Phone Number: ");
            long phone = sc.nextLong();

            // Store data in file
            DataOutputStream dos = new DataOutputStream(
                    new FileOutputStream("student.txt"));

            dos.writeUTF(name);
            dos.writeInt(age);
            dos.writeFloat(weight);
            dos.writeFloat(height);
            dos.writeUTF(city);
            dos.writeLong(phone);

            dos.close();
            System.out.println("\nData Stored Successfully!");

            // Retrieve data from file
            DataInputStream dis = new DataInputStream(
                    new FileInputStream("student.txt"));

            System.out.println("\nRetrieved Data:");
            System.out.println("Name: " + dis.readUTF());
            System.out.println("Age: " + dis.readInt());
            System.out.println("Weight: " + dis.readFloat());
            System.out.println("Height: " + dis.readFloat());
            System.out.println("City: " + dis.readUTF());
            System.out.println("Phone: " + dis.readLong());

            dis.close();

        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}