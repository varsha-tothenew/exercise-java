package exercise;

class OverloadingMethods {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    float multiply(float a, float b) {
        return a * b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    String concatenate(String a, String b) {
        return a + b;
    }

    String concatenate(String a, String b, String c) {
        return a + b + c;
    }
}

public class Question10 {
    public static void main(String[] args) {
        OverloadingMethods obj1 = new OverloadingMethods();
        System.out.println("adding two integers: " + obj1.add(12, 14));
        System.out.println("adding two double: " + obj1.add(12.00, 14.00));
        System.out.println("multiplying two floats: " + obj1.multiply(12.00f, 14.00f));
        System.out.println("multiplying two integers: " + obj1.multiply(12, 14));
        System.out.println("concatenating two strings: " + obj1.concatenate("Varsha", "Deora"));
        System.out.println("concatenating two strings: " + obj1.concatenate("Hello", "Varsha", "Deora"));


    }
}