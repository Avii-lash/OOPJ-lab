package LAB_9;

class Sync
{
    synchronized void display(String name)
    {
        String words[] = {"I","Love","Java","Very","Much"};

        for(String w : words)
        {
            System.out.println(name + ": " + w);
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e){}
        }
    }
}

class Thread1 extends Thread
{
    Sync s;

    Thread1(Sync s)
    {
        this.s = s;
    }

    public void run()
    {
        s.display("Thread 1");
    }
}

class Thread2 extends Thread
{
    Sync s;

    Thread2(Sync s)
    {
        this.s = s;
    }

    public void run()
    {
        s.display("Thread 2");
    }
}

public class Q2
{
    public static void main(String args[])
    {
        Sync obj = new Sync();

        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);

        t1.start();
        t2.start();
    }
}