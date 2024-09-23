package Chapter2.From_python_Dietel_to_java;

public class Table_of_Squares_and_Cubes {

    public static void main(String[] args) {

        System.out.println("\nnumber\tsquare\tcube");

        for (int number = 0; number <= 5; number++) {

            int square = number * number;

            int cube = number * number * number;

            System.out.println(number + "\t" + square + "\t" + cube);
        }


        System.out.printf("%6s\t%6s\t%6s%n", "number", "square", "cube");

        for (int number = 0; number <= 5; number++) {

            int square = number * number;

            int cube = number * number * number;

            System.out.printf("%6d\t%6d\t%6d%n", number, square, cube);
        }

    }

}
