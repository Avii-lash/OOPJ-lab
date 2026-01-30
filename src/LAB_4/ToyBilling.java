package LAB_4;

import java.util.Scanner;

public class ToyBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of toys: ");
        int n = sc.nextInt();

        int[] id = new int[n];
        String[] name = new String[n];
        int[] qty = new int[n];
        double[] price = new double[n];

        double grandTotal = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of toy " + (i + 1));

            System.out.print("Toy id: ");
            id[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Toy name: ");
            name[i] = sc.nextLine();

            System.out.print("Toy quantity: ");
            qty[i] = sc.nextInt();

            System.out.print("Toy price: ");
            price[i] = sc.nextDouble();

            grandTotal += qty[i] * price[i];
        }

        System.out.println("\nToy Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Toy id: " + id[i]);
            System.out.println("Toy name: " + name[i]);
            System.out.println("Toy quantity: " + qty[i]);
            System.out.println("Toy price: " + price[i]);
            System.out.println("Total price: " + (qty[i] * price[i]));
            System.out.println();
        }

        System.out.println("Grand Total Billing Amount: " + grandTotal);
    }
}