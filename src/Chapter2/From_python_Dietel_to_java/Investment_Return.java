package Chapter2.From_python_Dietel_to_java;

import java.util.Scanner;

public class Investment_Return {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nHow much would you like to invest? : ");
        double principal = input.nextDouble();

        System.out.println("\nWhat is your investment rate? : ");
        double rate = input.nextDouble();

        System.out.println("\nHow many years would like to invest? : ");
        int years = input.nextInt();

        double amount = calculate_money_invested(principal, rate, years);
        System.out.printf("\nAfter %d years, Your investment rate is $%.2f%n",years,amount);
    }

    public static double calculate_money_invested(double principal, double rate, int years) {
         return principal * Math.pow(1 + rate, years);
    }
}
