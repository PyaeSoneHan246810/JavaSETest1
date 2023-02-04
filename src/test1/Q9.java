import java.util.*;
public class Q9 {
    //Q9 - Searching index of a number in array
    public static int findIndex(int arr[], int t)
    {
        // if array is Null
        if (arr == null) {
            return -1;
        }

        // find length of array
        int len = arr.length;
        int i = 0;

        // traverse in the array
        while (i < len) {

            // if the i-th element is t
            // then return the index
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] my_array = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };

        System.out.println("Array = " + Arrays.toString(my_array));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number that you want to know the index: ");
        int number = sc.nextInt();

        System.out.println("Index position of " + number + " is: " + findIndex(my_array, number));
    }
}
