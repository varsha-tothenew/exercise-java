package collections.exercise;
//1.Write Java code to define List .
// Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        List<Float> list=new ArrayList();
        list.add(1.2F);
        list.add(2.3F);
        list.add(3.3F);
        list.add(2.9F);
        list.add(5.2F);

        Iterator iterator=list.iterator();
        float sum=0;
        while (iterator.hasNext()){
            sum=(float)iterator.next()+sum;
        }
        System.out.println(sum);
        System.out.println(String.format("%.2f",sum));
    }
}
