package exercise;

// Q7. Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively
public class Question7 {
    //static variables
    private static String first_name;
    private static String last_name;
    private static int age;

    //static block will be first
    static {
        first_name = "Varsha";
        System.out.println("First Name : " + first_name);
    }

    public static void main(String[] args) {
        Question7 ques = new Question7();
        Question7.setAge(20);
        Question7.setLast_name("Deora");
        System.out.println("Last Name : " + ques.getLast_name());
        System.out.println("Age : " + ques.getAge());

    }

    public int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Question7.age = age; //this cannot be used in static refernce thus to access variable class name is used
    }

    public String getLast_name() {
        return last_name;
    }

    public static void setLast_name(String ln) {
        last_name = ln;
    }
}
