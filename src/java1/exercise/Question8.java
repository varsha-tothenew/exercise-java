package exercise;

// Q8. Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer
public class Question8 {
    public static void main(String args[]) {
        String original = "varsha deora";
        System.out.println("original string:: " +original);
        String rev_string = reverseByChar(original);
        System.out.println("reversed string:: "+rev_string);

        StringBuffer sb = new StringBuffer(rev_string);
        sb.replace(4, 9, "");
        System.out.println("reversed string with remove index 4 to 9 :: " +sb);

        StringBuilder revStr=reverseByStringBuilder(original);
        System.out.println("reversed string using string builder with remove index 4 to 9 :: " +revStr);
    }

    public static String reverseByChar(String s) {
        char[] stringToCharArray = s.toCharArray();
        String rev_string = "";
        for (int i = stringToCharArray.length - 1; i >= 0; i--) {
            rev_string = rev_string + stringToCharArray[i];
        }
        return rev_string;
    }

    public static StringBuilder reverseByStringBuilder(String s) {
        StringBuilder input1 = new StringBuilder();
        // append a string into StringBuilder input1
        input1.append(s);
        // reverse StringBuilder input1
        input1 = input1.reverse();
        input1.replace(4,9,"");
        return input1;
    }
}
    /*Following are some interesting facts about String and StringBuffer classes :
1. Objects of String are immutable.
2. String class in Java does not have reverse() method, however StringBuilder class has built in reverse() method.
3. StringBuilder class do not have toCharArray() method, while String class does have toCharArray() method.*/
