package Chapter2;

import java.util.Scanner;

public class Comparing_Integers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        int sum = (num * num);

        System.out.println("\nThe number is " +num+ " and the square is " +sum);
        if (sum <= 100) System.out.println("\nThis number " +num+ " and it's square " +sum+ " is less than 100");
        if (sum >= 100) System.out.println("\nThis number " +num+ " and it's square " +sum+ " is greater than 100");
        if (sum == 100) System.out.println("\nThis number " +num+ " and it's square " +sum+ " is equal to 100");
        if (sum != 100) System.out.println("\nThis number " +num+ " and it's square " +sum+ " is not equal to 100");


    }
}
