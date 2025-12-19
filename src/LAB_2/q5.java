package LAB_2;

import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;

    // Method to read student details
    void read(Scanner sc) {
        System.out.print("Enter Roll No: ");
        roll = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter CGPA: ");
        cgpa = sc.nextDouble();
    }

    // Method to display student details
    void display() {
        System.out.println("Roll No: " + roll);
        System.out.println("Name   : " + name);
        System.out.println("CGPA   : " + cgpa);
        System.out.println("----------------------");
    }
}

public class q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));
            students[i] = new Student();
            students[i].read(sc);
        }

        // Display all student details
        System.out.println("\n--- Student Details ---");
        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        // Find student with lowest CGPA
        Student lowest = students[0];
        for (int i = 1; i < n; i++) {
            if (students[i].cgpa < lowest.cgpa) {
                lowest = students[i];
            }
        }

        // Display student with lowest CGPA
        System.out.println("Student with Lowest CGPA:");
        System.out.println("Name: " + lowest.name);
        System.out.println("CGPA: " + lowest.cgpa);

        sc.close();
    }
}