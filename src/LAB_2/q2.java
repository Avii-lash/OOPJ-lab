package LAB_2;

import java.util.Scanner;

class q2{

    static int count = 0;

    q2() {
        count++;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of objects to be created: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            new q2();
        }

        System.out.println("Number of objects created = " + count);
    }
}
//avi