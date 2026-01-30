package LAB_5.Q2;

import java.util.Scanner;

public class StringOperations {

    static boolean isPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return s.equalsIgnoreCase(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(str.toUpperCase());
        System.out.println(new StringBuilder(str).reverse());

        String str2 = sc.nextLine();
        int diff = Math.abs(str.charAt(0) - str2.charAt(0));
        System.out.println(diff);

        String insert = sc.nextLine();
        System.out.println(str + " " + insert);

        String s1 = sc.nextLine();
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        String s2 = sc.nextLine();
        char ch = sc.next().charAt(0);
        int pos = s2.indexOf(ch);
        if (pos != -1)
            System.out.println(pos);
        else
            System.out.println("Not present");

        sc.nextLine();

        String pal = sc.nextLine();
        if (isPalindrome(pal))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");

        String sentence = sc.nextLine();
        int vowels = 0, consonants = 0;
        sentence = sentence.toLowerCase();

        for (char c : sentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        int words = sentence.split("\\s+").length;

        System.out.println(words);
        System.out.println(vowels);
        System.out.println(consonants);
    }
}