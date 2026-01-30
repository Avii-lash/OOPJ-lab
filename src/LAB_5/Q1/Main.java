package LAB_5.Q1;

import java.util.Scanner;
import LAB_5.Q1.Marketing.Sales;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the employee id and employee name");
        int id = sc.nextInt();
        String name = sc.next();

        System.out.println("Enter the basic salary");
        double basic = sc.nextDouble();

        Sales s = new Sales(id, name, basic);

        System.out.println("The emp id of the employee is " + id);
        System.out.println("The total earning is " + s.totalEarning());
    }
}