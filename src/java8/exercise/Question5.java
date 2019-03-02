package java8.exercise;


/*
4.
Implement following functional interfaces from java.util.function using lambdas:

        (1) Consumer

        (2) Supplier

        (3) Predicate

        (4) Function
*/


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Question5 {
    public static void main(String[] args) {
        Consumer consumer=(str)-> System.out.println(str);
        consumer.accept("varsha");

        Supplier supplier=() -> 2;
        System.out.println(supplier.get());

        Predicate predicate=(o) ->o.equals(5);
        System.out.println(predicate.test(5));

        Function function=(o)-> o;
        System.out.println(function.apply(3));

        /*Consumer consumer=new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        };
        consumer.accept("varsha");

        Supplier supplier=new Supplier() {
            @Override
            public Object get() {
                return 2;
            }
        };
        System.out.println(supplier.get());

        Predicate predicate=new Predicate() {
            @Override
            public boolean test(Object o) {
                return o.equals(5);
            }
        };
        System.out.println(predicate.test(5));

        Function function=new Function() {
            @Override
            public Object apply(Object o) {
                return o;
            }
        };
        System.out.println(function.apply(3));*/
    }
}
