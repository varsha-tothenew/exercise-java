package exercise;

// Q6. There is an array with every element repeated twice except one. Find that element
public class Question6 {
    public static void main(String args[]) {
        int a[] = {1, 1, 2, 2, 3, 4, 3, 4, 5};
        int res = a[0];
        for (int i = 1; i < a.length; i++) {
            res = res ^ a[i];
        }
        System.out.println(res);
    }
}
