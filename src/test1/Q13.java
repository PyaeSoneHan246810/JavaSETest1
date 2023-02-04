package test1;

import java.util.Arrays;

public class Q13 {
    public static void main(String[] args) {
        int[ ] numbers = {2, 4, 6, 8, 8, 10, 10};

        System.out.println("Array = " + Arrays.toString(numbers));
        System.out.print("Duplicated Elements: ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.print(numbers[j] + " ");
                }
            }
        }
    }
}
