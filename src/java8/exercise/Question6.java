package java8.exercise;

//6.Create and access default and static method of an interface.

interface Test{
    void instanceMethod();

    default void defaultMethod(){
        System.out.println("in default func of interface");
    }
    static void staticMethod(){
        System.out.println("in static method of interface");
    }
}

public class Question6 {
    public static void main(String[] args) {
        Test test=() ->{
                System.out.println("in instance method of interface implemented in class");
        };
        test.instanceMethod();
        test.defaultMethod();
        Test.staticMethod();
    }
}
