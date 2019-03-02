package java8.exercise;

//10.Sum all the numbers greater than 5 in the integer list.

import java.util.Arrays;
import java.util.List;

public class Question10 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,30,2,4,8,6,13,45,78);
        int sum=list.stream().filter(e->e%2==0).reduce(0,(a,b)->a+b);
        //initalised a as 0 and b as 10
        System.out.println(sum);
    }
}
