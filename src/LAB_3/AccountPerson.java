package LAB_3;

import java.util.Scanner;

// Base class
class Account {
    int acc_no;
    double balance;

    void input(Scanner sc) {
        System.out.print("Enter Account Number: ");
        acc_no = sc.nextInt();

        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance       : " + balance);
    }
}

// Subclass
class Person extends Account {
    String name;
    long aadhar_no;

    void input(Scanner sc) {
        System.out.print("Enter Name: ");
        sc.nextLine();          // consume newline
        name = sc.nextLine();

        System.out.print("Enter Aadhar Number: ");
        aadhar_no = sc.nextLong();

        super.input(sc);        // call Account input
    }

    // Overridden method
    void disp() {
        System.out.println("Name          : " + name);
        System.out.println("Aadhar Number : " + aadhar_no);
        super.disp();           // call Account disp
    }
}

// Main class
public class AccountPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person[] p = new Person[3];

        // Input details
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details of Person " + (i + 1));
            p[i] = new Person();
            p[i].input(sc);
        }

        // Display details
        System.out.println("\n--- Details of Three Persons ---");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nPerson " + (i + 1));
            p[i].disp();
        }

        sc.close();
    }
}
