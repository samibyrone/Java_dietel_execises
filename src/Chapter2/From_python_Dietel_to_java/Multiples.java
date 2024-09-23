package Chapter2.From_python_Dietel_to_java;

public class Multiples {

    public static int Number_multiples_of_4(int number){

        if (number % 4 == 0) System.out.println(number + " is a multiple of 4.");
        else System.out.println(number + " is not a multiple of 4.");
        return number;
    }

    public static int Number_multiples_of_10(int number){
        if (number % 10 == 0) System.out.println(number + " is a multiple of 10.");
        else System.out.println(number + " is not a multiple of 10.");
        return number;
    }
}
