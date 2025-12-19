package LAB_2;

import java.util.Scanner;

class q7 {
    int length;
    int breadth;

    // Default constructor
    q7() {
        length = 0;
        breadth = 0;
    }

    // Parameterized constructor
    q7(int l, int b) {
        length = l;
        breadth = b;
    }

    void displayArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using default constructor
        q7 r1 = new q7();
        System.out.print("Area using default constructor: ");
        r1.displayArea();

        // Using parameterized constructor
        System.out.print("Enter length: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();

        q7 r2 = new q7(length, breadth);
        r2.displayArea();

        sc.close();
    }
}
