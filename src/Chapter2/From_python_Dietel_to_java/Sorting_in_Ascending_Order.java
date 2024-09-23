package Chapter2.From_python_Dietel_to_java;

import java.util.Scanner;

public class Sorting_in_Ascending_Order {

    public static double[] number_ascending_order(int number1, int number2, int number3) {

        if (number1 > number2) {int number = number1; number1 = number2; number2 = number;}
        if (number1 > number3) {int number = number1; number1 = number3; number3 = number;}
        if (number2 > number3) {int number = number2; number2 = number3; number3 = number;}

        return new double [] {number1, number2, number3};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter the first number: ");
        int number1 = input.nextInt();

        System.out.print("\nEnter the second number: ");
        int number2 = input.nextInt();

        System.out.print("\nEnter the third number: ");
        int number3 = input.nextInt();

        System.out.print("\nThe numbers collected are : " +number1+", "+number2+", "+number3);

        double[] ascending_order = number_ascending_order(number1, number2, number3);
            System.out.println("\n The Numbers in Ascending order: " + ascending_order[0]+", " +ascending_order[1]+", "+ascending_order[2]);
    }
}
