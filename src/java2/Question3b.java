package java2;

// 3. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
public class Question3b {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("class B");
    }
}
class A

{

    // some code

}
/*When you compile the above program, two .class files will be generated. One is A.class and another one is B.class.
 If you remove the A.class file and run the B.class file, Java Runtime System will throw NoClassDefFoundError like below:*/