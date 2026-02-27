package LAB_7;

import java.io.*;

public class Q3 {
    public static void main(String[] args) throws IOException {

        FileInputStream f1 = new FileInputStream("file1.bin");
        FileInputStream f2 = new FileInputStream("file2.bin");

        int b1, b2, pos = 1;
        boolean equal = true;

        while ((b1 = f1.read()) != -1 && (b2 = f2.read()) != -1) {
            if (b1 != b2) {
                System.out.println("Files differ at byte position: " + pos);
                equal = false;
                break;
            }
            pos++;
        }

        if (equal && f1.read() == -1 && f2.read() == -1) {
            System.out.println("Two files are equal");
        }

        f1.close();
        f2.close();
    }
}