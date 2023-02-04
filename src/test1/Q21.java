package test1;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        //Q21 - Fibonacci Number Series

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many number that you want to find the Fibonacci Number Series: ");
        int count = sc.nextInt();
        int number1 = 0;
        int number2 = 1;
        int number3;
        int i;

        System.out.println();
        System.out.print("Fibonacci Number Series: ");
        System.out.print(number1 + " " + number2);
        for(i = 2; i < count; ++i)
        {
            number3 = number1 + number2;
            System.out.print(" " + number3);
            number1 = number2;
            number2 = number3;
        }
    }
}
