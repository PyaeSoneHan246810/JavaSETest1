package test1;

import java.util.Arrays;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers_new = new int[numbers.length - 1];

        System.out.println("Array = " + Arrays.toString(numbers));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of array element that you want to delete: ");
        int number_value = sc.nextInt();



        System.out.println();
        System.out.println("Before deletion :" + Arrays.toString(numbers));
        System.out.println("After deletion :" + Arrays.toString(numbers_new));
    }
}
