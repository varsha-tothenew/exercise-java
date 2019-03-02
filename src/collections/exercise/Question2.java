package collections.exercise;

import java.util.HashSet;
import java.util.Set;

//2.Write a method that takes a string and returns the number of unique characters in the string.
public class Question2 {
    public static void main(String[] args) {
        String string = "hey i am  varsha";
        int numOfUniqueChar = unique(string);
        System.out.println("number of unique characters in string= " + numOfUniqueChar);
    }

    public static int unique(String s) {
        String lowercaseString = s.toLowerCase();
        char[] chars = lowercaseString.replace(" ", "").toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c : chars) {
            set.add(c);
        }
        System.out.println(set);
        return set.size();
    }
}
