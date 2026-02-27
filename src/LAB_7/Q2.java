package LAB_7;

import java.io.*;
import java.util.*;

public class Q2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter source file: ");
        String source = sc.nextLine();

        System.out.print("Enter destination file: ");
        String dest = sc.nextLine();

        // Character Stream
        FileReader fr = new FileReader(source);
        FileWriter fw = new FileWriter(dest);

        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }
        fr.close();
        fw.close();

        // Byte Stream (optional demonstration)
        FileInputStream fis = new FileInputStream(source);
        FileOutputStream fos = new FileOutputStream("byte_" + dest);

        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        fis.close();
        fos.close();

        System.out.println("File Copied Successfully!");
    }
}