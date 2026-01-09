package LAB_3;

import java.util.Scanner;

// Base class
class Plate {
    double length, width;

    Plate(double l, double w) {
        length = l;
        width = w;
        System.out.println("Plate constructor executed");
    }
}

// Derived class
class Box extends Plate {
    double height;

    Box(double l, double w, double h) {
        super(l, w);   // Call Plate constructor
        height = h;
        System.out.println("Box constructor executed");
    }
}

// Derived class
class WoodBox extends Box {
    double thickness;

    WoodBox(double l, double w, double h, double t) {
        super(l, w, h);   // Call Box constructor
        thickness = t;
        System.out.println("WoodBox constructor executed");
    }

    void display() {
        System.out.println("\nDimensions of Wood Box:");
        System.out.println("Length     : " + length);
        System.out.println("Width      : " + width);
        System.out.println("Height     : " + height);
        System.out.println("Thickness  : " + thickness);
    }
}

// Main class
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        System.out.print("Enter thickness: ");
        double t = sc.nextDouble();

        WoodBox wb = new WoodBox(l, w, h, t);
        wb.display();

        sc.close();
    }
}
