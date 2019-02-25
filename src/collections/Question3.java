package collections;

import java.util.HashMap;
import java.util.Map;

//Write a method that takes a string and print the number of occurrence of each character characters in the string.
public class Question3 {
    public static void main(String[] args) {
        String string="hey i am varsha VARSHA";
        occurance(string);
    }
    public static void occurance(String s){
        char[] charArr=s.replace(" ","").toLowerCase().toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(char c:charArr){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else
                map.put(c,1);
        }

        // Printing the charCountMap
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
