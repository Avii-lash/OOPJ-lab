package LAB_3;

import java.util.Scanner;

// 2D class
class Plastic2D {
    double length;
    double breadth;
    static final int COST_PER_SQFT = 40;

    void input2D(double l, double b) {
        length = l;
        breadth = b;
    }

    double calculateCost() {
        double area = length * breadth;
        return area * COST_PER_SQFT;
    }
}

// 3D class inheriting from 2D
class Plastic3D extends Plastic2D {
    double height;
    static final int COST_PER_CUBICFT = 60;

    void input3D(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    double calculateCost() {
        double volume = length * breadth * height;
        return volume * COST_PER_CUBICFT;
    }
}

// Main class
public class PlasticCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter choice:");
        System.out.println("1. 2D Sheet");
        System.out.println("2. 3D Box");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter length and breadth (in ft): ");
            double l = sc.nextDouble();
            double b = sc.nextDouble();

            Plastic2D sheet = new Plastic2D();
            sheet.input2D(l, b);

            System.out.println("Cost of plastic sheet = Rs " + sheet.calculateCost());

        } else if (choice == 2) {
            System.out.print("Enter length, breadth and height (in ft): ");
            double l = sc.nextDouble();
            double b = sc.nextDouble();
            double h = sc.nextDouble();

            Plastic3D box = new Plastic3D();
            box.input3D(l, b, h);

            System.out.println("Cost of plastic box = Rs " + box.calculateCost());

        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
