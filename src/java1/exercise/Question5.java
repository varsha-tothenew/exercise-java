package exercise;

import java.util.Arrays;

// Q5. Find common elements between two arrays.
public class Question5 {
    public static void main(String args[]) {
        int arr1[] = {1, 2, 3, 34, 5, 6, 6};
        int arr2[] = {1, 3, 5, 9, 8, 7, 7, 0, 89};
        commonElements(arr1, arr2);

        System.out.println("common elements are ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(" " + arr1[i]);
                }
            }
        }
    }
    //improved method with complexity nlogn
    public static void commonElements(int arr1[], int arr2[]) {
        Arrays.sort(arr1);

        for (int i = 0; i < arr2.length; i++) {
            int a = Arrays.binarySearch(arr1, arr2[i]);
            if (a >= 0)
                System.out.println(arr1[a]);
        }
    }
}
