package LAB_2;

import java.util.Scanner;

class q3 {
    double length;
    double width;
    double height;

    // Method to calculate volume
    double volume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        q3 b = new q3();

        System.out.print("Enter length: ");
        b.length = sc.nextDouble();

        System.out.print("Enter width: ");
        b.width = sc.nextDouble();

        System.out.print("Enter height: ");
        b.height = sc.nextDouble();

        System.out.println("Volume = " + b.volume());

        sc.close();
    }
}
