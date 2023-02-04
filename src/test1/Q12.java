package test1;
import java.util.Arrays;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        //Q12 - Deleting Array Element by Position

        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers_new = new int[numbers.length - 1];

        System.out.println("Array = " + Arrays.toString(numbers));
        System.out.println("Array Length = " + numbers.length);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position of array element  that you want to delete: ");
        int number_position = sc.nextInt();

        for(int i = 0, k = 0; i < numbers.length; i++){
            if(i != number_position){
                numbers_new[k] = numbers[i];
                k++;
            }
        }

        System.out.println();
        System.out.println("Before deletion :" + Arrays.toString(numbers));
        System.out.println("After deletion :" + Arrays.toString(numbers_new));

    }
}
