package test1;
import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        //Q15 - Counting total number of even and odd numbers in the array

        int Size, i, evenCount = 0, oddCount = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter Number of elements in an array: ");
        Size = sc.nextInt();

        int [] a = new int[Size];

        System.out.println("Please Enter " + Size + " elements of an array: ");
        for (i = 0; i < Size; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("List of Even Numbers in this Array are: ");
        for(i = 0; i < Size; i++)
        {
            if(a[i] % 2 == 0)
            {
                System.out.print(a[i] +" ");
                evenCount++;
            }
        }
        System.out.println();
        System.out.println("Total Number of Even Numbers in this Array = " + evenCount);

        System.out.println();
        System.out.print("List of Odd Numbers in this Array are: ");
        for(i = 0; i < Size; i++)
        {
            if(a[i] % 2 != 0)
            {
                System.out.print(a[i] +" ");
                oddCount++;
            }
        }
        System.out.println();
        System.out.println("Total Number of Odd Numbers in this Array = " + oddCount);
    }
}
