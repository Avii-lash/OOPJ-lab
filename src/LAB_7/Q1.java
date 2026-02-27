package LAB_7;

import java.io.*;
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter file name: ");
            String filename = sc.nextLine();

            // Write to file
            FileWriter fw = new FileWriter(filename, true);
            fw.write("Roll: " + roll + ", Name: " + name +
                    ", Subject: " + subject + ", Marks: " + marks + "\n");
            fw.close();

            // Read from file
            System.out.println("\nFile Contents:");
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}