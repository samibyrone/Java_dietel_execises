package Chapter2;

import java.util.Scanner;

public class Body_Mass_Index_Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter your Weight in (kg): ");
        double weight = scanner.nextDouble();

        System.out.println("\nEnter your Height in (m): ");
        double height = scanner.nextDouble();

        String outcome = Body_Mass_Calculator(weight, height);
        System.out.printf("\nYOUR BODY MASS INDEX is %2f%s%n ", weight / (height * height), outcome);

    }

    public static String Body_Mass_Calculator(double weight, double height) {

        double bodyMassIndex = weight / (height * height);

        if (bodyMassIndex < 17.5) return "Your are UnderWeight";
        else if (bodyMassIndex < 25.5) return "You Have a Normal Weight";
        else if (bodyMassIndex < 31.5) return "You are Getting Overweight";
        else return "You Have Too Much Obesity, You Really need to Work on Yourself";
    }

}
