package java8.exercise;


interface Greater{
    boolean greaterNum(int a,int b);
}
interface Increment{
    int inc(int a);
}
interface ConcateStrings{
    String conc(String a, String b);
}
interface Upper{
    String upp(String a);
}
public class Question1 {
    public static void main(String[] args) {

        Greater greater = (int a, int b) -> {
            if (a > b)
                return true;
            else
                return false;
        };
        System.out.println( greater.greaterNum(5,6));

        Increment increment=a-> ++a;
        System.out.println(increment.inc(5));

        ConcateStrings concateStrings=(a,b)->a.concat(b);
        System.out.println(concateStrings.conc("varsha ","deora"));

        Upper upper=a->a.toUpperCase();
        System.out.println(upper.upp("hey"));
    }

}
