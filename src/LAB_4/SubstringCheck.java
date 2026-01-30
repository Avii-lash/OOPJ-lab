package LAB_4;

import java.util.Scanner;

public class SubstringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        System.out.print("Enter first substring: ");
        String sub1 = sc.nextLine();

        System.out.print("Enter second substring: ");
        String sub2 = sc.nextLine();

        if (s1.contains(sub1) && s2.contains(sub2)) {
            System.out.println(sub1 + sub2);
        } else {
            System.out.println("substring not found");
        }
    }
}