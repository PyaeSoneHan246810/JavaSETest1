package test1;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        //Q6 - Switch Case (String)

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        switch (name)
        {
            case "Dylan", "Robin", "Robert", "Angela", "David":
                System.out.println("Welcome to the party, " + name + ".");
                break;
            default:
                System.out.println("You are not in the guest list!");
        }
    }
}
