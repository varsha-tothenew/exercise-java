package java2;

public class Question5 implements Cloneable{
    private int a;
    private String b;


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public Question5(int a, String b) {
        this.a = a;
        this.b = b;
    }
    //copy constructor
    public Question5(Question5 q){
        this.a = q.a;
        this.b = q.b;
    }
    public Question5 clone()throws CloneNotSupportedException{
        return (Question5)super.clone();
    }

    public static void main(String[] args) {
        Question5 obj1=new Question5(1,"a");
        Question5 obj2=new Question5(obj1);//call copy constructor
        try {
            Question5 obj3=obj1.clone();
            System.out.println("a " + obj1.getA() + " b " + obj1.getB());
            System.out.println("a " + obj2.getA() + " b " + obj2.getB());
            System.out.println("a " + obj3.getA() + " b " + obj3.getB());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
