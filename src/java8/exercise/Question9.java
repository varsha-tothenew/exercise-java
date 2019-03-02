package java8.exercise;

//9.Collect all the even numbers from an integer list.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question9 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,30,2,4,8,6,13,45,78);
        List evenList=list.stream().filter(e->e%2==0).collect(Collectors.toList());
        evenList.forEach(System.out::println);}
}
