package exercise;

import java.util.Scanner;

//Q3. Write a program to find the number of occurrences of a character in a string without using loop?
public class Question3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine().toLowerCase();
        System.out.println("Enter a character to count in the string " + s);
        char c = sc.next(".").toLowerCase().charAt(0);
        int cn = s.length() - s.replaceAll(String.valueOf(c), "").length();
        System.out.println(c + " occurs " + cn + " times in " + s);
        sc.close();
    }
}
