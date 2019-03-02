package java8.exercise;

//Using (instance) Method reference create and apply add and subtract method and
// using (Static) Method reference create and apply multiplication method for the functional interface created.
interface MethodReferenceInterface {
    void display(int a,int b);
}

@FunctionalInterface
interface MethodReferenceInterface2{
    int addition(int a,int b);
    static int multiply(int a,int b){
        return a*b;
    }
}
public class Question3 {

    static void mul(int a,int b){
        System.out.println("Static method :: " + (a*b));
    }

    void add(int a,int b){
        System.out.println("Instance Method :: " + (a+b));
    }

    int addition(int a,int b){
        return (a+b);
    }


    public static void main(String[] args) {
        MethodReferenceInterface2 instanceMethodReferenceInterface2=new Question3()::addition;
        int add= instanceMethodReferenceInterface2.addition(1,2);
        System.out.println(add);
        //using lamda
        /*MethodReferenceInterface2 methodReferenceInterface3=(int a, int b) ->a+b;
        methodReferenceInterface3.addition(1,2);*/

        //without using lamda
/*        MethodReferenceInterface2 methodReferenceInterface2=new MethodReferenceInterface2() {
            @Override
            public int addition(int a, int b) {
                return a+b;
            }
        };
        int add=methodReferenceInterface2.addition(1,2);
        System.out.println(add);*/

        MethodReferenceInterface staticMethod=Question3::mul;
        staticMethod.display(5,6);

        //??acsess static method of functional interface using method refernce
          MethodReferenceInterface m= (a, b) ->MethodReferenceInterface2.multiply(20,30);
        /*int mul=MethodReferenceInterface2.multiply(5,2);
        System.out.println(mul);*/

        MethodReferenceInterface instanceMethod=new Question3()::add;
        instanceMethod.display(1,2);
        /*MethodReferenceInterface methodReferenceInterface1=new MethodReferenceInterface() {
            @Override
            public void display(int a, int b) {
                new Question3().add(a,b);
            }
        };
        methodReferenceInterface1.display(1,2);*/


    }
}
