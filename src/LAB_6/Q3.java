package LAB_6;

import java.util.Scanner;

// User-defined exception
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Q3 {

    static void ProcessInput(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException("number should be positive");
        } else {
            System.out.println("Double value: " + (num * 2));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            ProcessInput(n);
        }
        catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }

        sc.close();
    }
}
