package Chapter2;

public class Squares_and_Cubes_Tables {

    public static void main(String[] args) {

        System.out.printf("%10s%10s%10s%n", "Number", "Square", "Cube");

        for(int number = 0; number < 10; number++) {

            int square = number * number;

            int cube = number * number * number;

            System.out.printf("%10d%10d%10d%n", number, square, cube);
        }
    }
}
