package LAB_7;

import java.io.*;
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter filename: ");
        String filename = sc.nextLine();

        int chars = 0, words = 0, lines = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;

            while ((line = br.readLine()) != null) {
                lines++;
                chars += line.length();

                String[] w = line.trim().split("\\s+");
                if (!line.trim().isEmpty())
                    words += w.length;
            }

            br.close();

            System.out.println("No. of characters = " + chars);
            System.out.println("No. of lines = " + lines);
            System.out.println("No. of words = " + words);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}