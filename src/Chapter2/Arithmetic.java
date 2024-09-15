package Chapter2;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = input.nextInt();

        System.out.print("Enter the second number: ");
        int second = input.nextInt();

        int num = (first * first);
        int num2 = (second * second);
        int number = num + num2;
        int numbers = num2 - num;

        System.out.println(num);
        System.out.println(num2);
        System.out.println("The sum of their squares " + number);
        System.out.println("The difference of the squares are " + numbers);
    }
}
