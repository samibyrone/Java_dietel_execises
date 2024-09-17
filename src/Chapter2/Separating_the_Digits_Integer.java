package Chapter2;

import java.util.Scanner;

public class Separating_the_Digits_Integer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your five digit integer: ");
        int number = input.nextInt();

        int index1 = number / 10000;
        int index2 = (number / 1000) % 10;
        int index3 = (number / 100) % 10;
        int index4 = (number / 10) % 10;
        int index5 = number % 10;

        System.out.println(index1 + " " + index2 + " " + index3 + " " + index4 + " " + index5);
    }
}
