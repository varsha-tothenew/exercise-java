package java8.exercise;

interface Calculate<X>{
    X sum(X a,X b);
}
public class Question2 {
    public static void main(String[] args) {
        Calculate<Integer> calculate=(a,b)->a+b;
        System.out.println(calculate.sum(1,2));
    }
}
