package test1;

import java.util.Arrays;

public class Q10 {
    public static void main(String[] args) {
        //Q10 - Array Sorting (Decreasing Order)

        int[] numbers = {5, 4, 1, 8, 6, 9};

        int value = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > numbers[i]) {
                    value = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = value;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
