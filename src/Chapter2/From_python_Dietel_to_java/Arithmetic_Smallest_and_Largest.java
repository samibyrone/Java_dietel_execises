package Chapter2.From_python_Dietel_to_java;

import java.util.Scanner;

public class Arithmetic_Smallest_and_Largest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter the first number ");
        int first = input.nextInt();

        System.out.print("\nEnter the second number ");
        int second = input.nextInt();

        System.out.print("\nEnter the third number ");
        int third = input.nextInt();

        int sum = first + second + third;

        int average = sum / 3;

        int product = first * second * third;

        int smallest = first;
        if (second < smallest) smallest = second;
        if (third < smallest) smallest = third;

        int largest = first;
        if (second > largest) largest = second;
        if (third > largest) largest = third;

        System.out.println("\nThe sum of all numbers is " + sum);
        System.out.println("\nThe average of the numbers is " + average);
        System.out.println("\nThe product of the numbers is " + product);
        System.out.println("\nThe smallest number is " + smallest);
        System.out.println("\nThe largest number is " + largest);
    }

}
