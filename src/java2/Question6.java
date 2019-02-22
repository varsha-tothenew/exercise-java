package java2;

// 6. WAP showing try, multi-catch and finally blocks.
public class Question6 {
    public static void main(String args[]) {
        try {
            int a[] = new int[7];
            a[10] = 30 / 0; //as program is parsed right to left , div by zero error will occur first
            System.out.println("First print statement in try block");//if exception occurs unreachable statement
        } catch (ArithmeticException e) {
            System.out.println("Warning: ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Warning: ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Warning: Some Other exception");
        }
        // System.out.println("Out of try-catch block...");
        finally {
            System.out.println("This is finally block");
        }
        System.out.println("Out of try-catch-finally");
    }

}
