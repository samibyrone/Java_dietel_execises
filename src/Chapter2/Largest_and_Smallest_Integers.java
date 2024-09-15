package Chapter2;

import java.util.Scanner;

public class Largest_and_Smallest_Integers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        System.out.print("Enter the fourth number: ");
        int num4 = input.nextInt();

        System.out.print("Enter the fifth number: ");
        int num5 = input.nextInt();

        int smallest = num1;
        if(num2 < smallest) smallest = num2;
        if(num3 < smallest) smallest = num3;
        if(num4 < smallest) smallest = num4;
        if(num5 < smallest) smallest = num5;

        int largest = num1;
        if(num2 > largest) largest = num2;
        if(num3 > largest) largest = num3;
        if(num4 > largest) largest = num4;
        if(num5 > largest) largest = num5;

        System.out.println("\nThe smallest integer in the group of five integer is: " + smallest);
        System.out.println("\nThe largest integer in the group of five integer is: " + largest);
    }
}
