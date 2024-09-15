package Chapter2;

import java.util.Scanner;

public class Diameter_Circumference_and_Area_of_Circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double PI = 3.14159;

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        double diameter = 2 * radius;

        System.out.print("\nThe area of the circle is: " +area);
        System.out.print("\nThe diameter of the circle is: " + diameter);
        System.out.print("\nThe circumference of the circle is: " + circumference);

    }
}
