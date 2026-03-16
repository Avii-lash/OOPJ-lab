package LAB_9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q3 extends JFrame implements ActionListener, Runnable
{
    JLabel timeLabel;
    JButton start, reset;

    int sec=0, min=0, hr=0;
    boolean running=false;

    Thread t;

    Q3()
    {
        setTitle("Stop Watch");

        timeLabel = new JLabel("00 : 00 : 00");
        timeLabel.setFont(new Font("Arial",Font.BOLD,25));

        start = new JButton("Start");
        reset = new JButton("Reset");

        start.addActionListener(this);
        reset.addActionListener(this);

        setLayout(new FlowLayout());
        add(timeLabel);
        add(start);
        add(reset);

        setSize(250,150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==start)
        {
            running=true;
            t=new Thread(this);
            t.start();
        }

        if(e.getSource()==reset)
        {
            running=false;
            sec=min=hr=0;
            timeLabel.setText("00 : 00 : 00");
        }
    }

    public void run()
    {
        try
        {
            while(running)
            {
                Thread.sleep(1000);
                sec++;

                if(sec==60)
                {
                    sec=0;
                    min++;
                }

                if(min==60)
                {
                    min=0;
                    hr++;
                }

                timeLabel.setText(
                        String.format("%02d : %02d : %02d",hr,min,sec)
                );
            }
        }
        catch(Exception e){}
    }

    public static void main(String[] args)
    {
        new Q3();
    }
}