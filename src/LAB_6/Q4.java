package LAB_6;

import java.util.Scanner;

// Custom Exceptions
class HrsException extends Exception {
    public HrsException(String msg) {
        super(msg);
    }
}

class MinException extends Exception {
    public MinException(String msg) {
        super(msg);
    }
}

class SecException extends Exception {
    public SecException(String msg) {
        super(msg);
    }
}

class Time {
    int hours, minutes, seconds;

    void getTime() throws HrsException, MinException, SecException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        hours = sc.nextInt();

        System.out.print("Enter minutes: ");
        minutes = sc.nextInt();

        System.out.print("Enter seconds: ");
        seconds = sc.nextInt();

        if (hours < 0 || hours > 24)
            throw new HrsException("hour is not in valid range (0–24)");

        if (minutes < 0 || minutes > 60)
            throw new MinException("minute is not in valid range (0–60)");

        if (seconds < 0 || seconds > 60)
            throw new SecException("second is not in valid range (0–60)");

        System.out.println("Correct Time-> " + hours + ":" + minutes + ":" + seconds);

        sc.close();
    }
}

public class Q4 {
    public static void main(String[] args) {
        Time t = new Time();

        try {
            t.getTime();
        }
        catch (HrsException | MinException | SecException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }
    }
}
