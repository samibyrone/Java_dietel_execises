package Chapter2;

public class Checkerboard_Pattern_of_Asterisks {

    public static void main(String[] args) {

        int index = 10;
        for (int count = 0; count < index; count++) {
            for (int counter = 0; counter < index; counter++) {
                if ((count + counter) % 2 == 0) System.out.print(" *");
                else System.out.print("* ");
            }
            System.out.println();
        }
    }
}
