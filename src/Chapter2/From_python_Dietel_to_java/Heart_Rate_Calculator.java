package Chapter2.From_python_Dietel_to_java;

import java.util.Scanner;

public class Heart_Rate_Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int age;

        System.out.print("Enter your age: ");
        age = input.nextInt();
    }

    public static double calculate_max_heartbeat_rate(int age) {
        int heartbeat_rate = 200 - age;
        double minimum_heart_rate = heartbeat_rate * 0.05;
        double maximum_heart_rate = heartbeat_rate * 0.085;
        return heartbeat_rate;
    }
}
