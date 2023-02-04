package test1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        //Q4 - if else-if else

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your lucky draw coupon number (between 1 to 100) : ");
        int number = sc.nextInt();

        if (number == 69) {
            System.out.println("Congratulation! You have won a car!");
        }
        else if (number == 96) {
            System.out.println("Congratulation! You have won an IPhone!");
        }
        else {
            System.out.println("Sorry! You will be lucky next time.");
        }
    }
}
