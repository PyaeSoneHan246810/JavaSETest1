package test1;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        //Q20 - Prime Number Series

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum number that you want to find the Prime Number Series: ");
        int count = sc.nextInt();

        int i =0;
        int num =0;
        String  primeNumbers = "";

        for (i = 1; i <= count; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to " + count + " are:");
        System.out.println(primeNumbers);
    }
}
