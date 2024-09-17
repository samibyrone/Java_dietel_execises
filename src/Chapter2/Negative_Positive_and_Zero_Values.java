package Chapter2;

import java.util.Scanner;

public class Negative_Positive_and_Zero_Values {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;

        System.out.println("\nEnter Ten Numbers to Check: ");
        for (int index = 0; index < 10; index ++) {

            double number = input.nextDouble();

            if (number > 0) positive++;
            else if (number < 0) negative++;
            else zero++;
        }

        System.out.printf("\nWe Have %d Positive numbers: ", positive);
        System.out.printf("\nWe Have %d Negative numbers: ", negative);
        System.out.printf("\nWe Have %d Zeros: ", zero);

    }
}
