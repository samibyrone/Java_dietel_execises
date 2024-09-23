package Chapter2.From_python_Dietel_to_java;

public class Circle_area_diameter_and_circumference {

    private static final int radius = 2;
    private static final double pi = 3.14159;

    public static double circle_of_area(int radius, double pi) {
        double area = pi * radius * radius;
        return area;
    }

    public static int circle_of_diameter(int radius) {
        int diameter = 2 * radius;
        return diameter;
    }

    public static double circle_of_circumference(int radius, double pi) {
        double circumference = 2 * pi * radius;
        return circumference;
    }

}
