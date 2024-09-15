package Chapter2;

import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int triple = num * 3;
        int doubled = num2 * 2;
        int result = triple % doubled;

        if(triple % doubled == 0)System.out.println("The number " +triple+ " is a multiple of " +doubled+ "\nThe result is: " + result);
        else System.out.println("The number " +triple+ " is not a multiple of " +doubled);
    }
}
