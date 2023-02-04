package test1;
import java.util.Arrays;
import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        //Q14 - Sum of all elements of the array

        System.out.print("Enter the required size of the array: ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int myArray[] = new int [size];
        int sum = 0;
        System.out.println("Enter the elements of the array one by one ");

        for(int i=0; i<size; i++){
            myArray[i] = s.nextInt();
            sum = sum + myArray[i];
        }
        System.out.println("Elements of the array are: "+Arrays.toString(myArray));
        System.out.println("Sum of the elements of the array: "+sum);
    }
}
