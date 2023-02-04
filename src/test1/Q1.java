package test1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        //Q1 - Factorial of a number

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int factorial = number;

        for (int i = (number -1); i > 1; i--) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
