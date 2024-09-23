package Chapter2.From_python_Dietel_to_java;

public class Arithmetic {

    private static double rightOperand = 2;
    private static double leftOperand = 27.5;

    public static double arithmetic_addition_operators(double right_operand, double left_operand) {
        rightOperand = right_operand;
        leftOperand = left_operand;

        return (right_operand + left_operand);
    }

    public static double arithmetic_subtraction_operators(double right_operand, double left_operand) {
        rightOperand = right_operand;
        leftOperand = left_operand;
        return (right_operand - left_operand);
    }

    public static double arithmetic_division_operators(double right_operand, double left_operand) {
        rightOperand = right_operand;
        leftOperand = left_operand;
        return (right_operand / left_operand);
    }

    public static double arithmetic_multiplication_operators(double right_operand, double left_operand) {
        rightOperand = right_operand;
        leftOperand = left_operand;
        return (right_operand * left_operand);
    }

    public static double arithmetic_exponent_operators(double right_operand, double left_operand) {
        rightOperand = right_operand;
        leftOperand = left_operand;
        return (Math.pow(rightOperand, leftOperand));
    }

    public static double arithmetic_floor_division_operators(double right_operand, double left_operand) {
        rightOperand = right_operand;
        leftOperand = left_operand;
        return (Math.floor(right_operand / left_operand));
    }
}
