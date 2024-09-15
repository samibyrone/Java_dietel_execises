package Chapter2;

import java.util.Scanner;

public class Divisible {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if(num % 3 == 0) System.out.println(" this number: " +num+ " is Divisible by 3.");
        else System.out.println(" this number: " +num+ " is not Divisible by 3.");
    }
}
