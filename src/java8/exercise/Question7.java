package java8.exercise;

//7.Override the default method of the interface.
interface Test2{
    void instanceMethod();

    default void defaultMethod(){
        System.out.println("in default func of interface");
    }
    static void staticMethod(){
        System.out.println("in static method of interface");
    }
}
 class ImplemenmtTest2 implements Test2{
     @Override
     public void instanceMethod() {
         System.out.println("instance method of functional interface");
     }

     @Override
     public void defaultMethod() {
         System.out.println("default method of functional interface overriden");
     }

 }
public class Question7 {
    public static void main(String[] args) {
        ImplemenmtTest2 implemenmtTest2=new ImplemenmtTest2();
        implemenmtTest2.instanceMethod();
        implemenmtTest2.defaultMethod();

        Test2 test2=new ImplemenmtTest2();
        test2.instanceMethod();
        test2.defaultMethod();
        Test2.staticMethod();
    }
}
