package test1;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        //Q22 - Printing array in reverse order

        int[] numbers = {2, 4, 6, 8, 10};
        System.out.print("Enter the required size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int myArray[] = new int [size];
        int sum = 0;
        System.out.println("Enter the elements of the array one by one ");

        for(int i = 0; i < size; i++){
            myArray[i] = sc.nextInt();
        }

        System.out.println("Array in reverse order: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
