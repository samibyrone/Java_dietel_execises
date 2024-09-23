package Chapter2.From_python_Dietel_to_java;

import java.util.Scanner;

public class Odd_or_even {

    public static boolean is_number_even(int number) {

        if (number % 2 == 0) return true;
        else return false;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter an Number: ");
        int number = input.nextInt();

        if (is_number_even(number)) {
            System.out.println(number + "\n is an Even number.");
        }
        else {
            System.out.println(number + "\n is an Odd number.");
        }
    }
}
