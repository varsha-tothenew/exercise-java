package exercise;

import java.util.Arrays;

// Q2. Write a program to find the number of occurrences of the duplicate words in a string and print them ?
public class Question2 {
    public static void main(String[] args) {
        String input = "varsha is is is name hey hey my name is varsha varsha ";
        findDuplicate1(input);
        String sortedString = sortString2(input);
        System.out.println(sortedString);
        findDuplicate2(sortedString);
    }

    public static void findDuplicate1(String s) {
        String[] wordsArray = s.split(" ");
        int wordCount = 1;

        for (int i = 0; i < wordsArray.length; i++) {
            for (int j = i + 1; j < wordsArray.length; j++) {

                if (wordsArray[i].equals(wordsArray[j])) {
                    wordCount = wordCount + 1;
                    wordsArray[j] = "0";                     //Set words[j] to 0 to avoid printing visited word
                }
            }
            //Displays the duplicate word if count is greater than 1
            if (wordCount > 1 && wordsArray[i] != "0")
                System.out.println(wordsArray[i] + "--" + wordCount);
            wordCount = 1;

        }
    }

    public static void findDuplicate2(String s) {
        String[] wordsArray = s.split(" ");
        int wordCount = 1;
        for (int i = 0, j = 1; i <= wordsArray.length && j < wordsArray.length; j++) {

            if (wordsArray[i].equals(wordsArray[j])) {

                wordCount = wordCount + 1;
                //System.out.println("i" + i + "j" + j +"wc" + wordCount);
                continue;
            }
            if (wordCount > 1) {
                System.out.println(wordsArray[i] + "--" + wordCount);
                wordCount = 1;
            }
            i = j;
        }
    }

    //doubt ? the last iteraton i 9 j 11 values are true and loop continues without printing the last value
    public static String sortString2(String s) {

        String[] strArray = s.split("\\s+");
        Arrays.sort(strArray);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArray.length; i++) {
            sb.append(strArray[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
}
