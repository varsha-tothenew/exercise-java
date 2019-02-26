package exercise;

import java.util.Scanner;

// Q4. Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String
public class Question4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String sc = scanner.next();
        float lc = 0, uc = 0, spc = 0;
        for (int i = 0; i < sc.length(); i++) {
            char c = sc.charAt(i);
            if (Character.isLowerCase(c))
                lc++;
            else if (Character.isUpperCase(c))
                uc++;
            else
                spc++;
        }
        System.out.println("lower case : " + (int) lc + " percentage " + lc / sc.length() * 100);
        System.out.println("upper case : " + (int) uc + " percentage " + uc / sc.length() * 100);
        System.out.println("special character : " + (int) spc + " percentage " + spc / sc.length() * 100);


    }
}
