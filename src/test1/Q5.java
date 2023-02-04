package test1;

import java.util.Scanner;

public class Q5 {
    //Q5 - Switch Case
    public static void main(String[] args) {
        System.out.println("Motivational Program");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your favorite number (between 1 to 10): ");
        int number = sc.nextInt();

        System.out.println();
        System.out.println("Motivational Quote for you:");

        switch (number)
        {
            case 1:
                System.out.println("Just one small positive thought in the morning can change your whole day.");
                break;
            case 2:
                System.out.println("Opportunities don't happen, you create them.");
                break;
            case 3:
                System.out.println("Love your family, work super hard, live your passion.");
                break;
            case 4:
                System.out.println("It is never too late to be what you might have been.");
                break;
            case 5:
                System.out.println("Don't let someone else's opinion of you become your reality.");
                break;
            case 6:
                System.out.println("If you’re not positive energy, you’re negative energy.");
                break;
            case 7:
                System.out.println("I am not a product of my circumstances. I am a product of my decisions.");
                break;
            case 8:
                System.out.println("If you can dream it, you can do it.");
                break;
            case 9:
                System.out.println("Do the best you can. No one can do more than that.");
                break;
            case 10:
                System.out.println("Do what you can, with what you have, where you are.");
                break;
            default:
                System.out.println("It's weekend, Have Fun!");
        }
    }
}
