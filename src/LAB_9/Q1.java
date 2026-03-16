package LAB_9;

import java.util.Scanner;

class CounterThread extends Thread
{
    int lower, upper;

    CounterThread(String name, int l, int u)
    {
        super(name);
        lower = l;
        upper = u;
    }

    public void run()
    {
        System.out.println("Thread - " + getName());
        System.out.print("Counter - ");

        for(int i = lower; i <= upper; i++)
        {
            System.out.print(i + " ");
            try
            {
                Thread.sleep(5);
            }
            catch(Exception e) {}
        }
    }
}

public class Q1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter thread name: ");
        String name = sc.nextLine();

        System.out.print("Enter lower range: ");
        int l = sc.nextInt();

        System.out.print("Enter upper range: ");
        int u = sc.nextInt();

        CounterThread t = new CounterThread(name,l,u);
        t.start();
    }
}