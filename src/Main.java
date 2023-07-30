import java.lang.Math;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Calculator on: \n");
        Scanner inputNum1 = new Scanner(System.in);
        Scanner inputOperator = new Scanner(System.in);
        Scanner inputNum2 = new Scanner(System.in);
        char operator;
        double firstField, secondField;
        double answer;

        while (true) {
            System.out.println();
            firstField = inputNum1.nextDouble();

            System.out.println();
            secondField = inputNum2.nextDouble();

            System.out.println(); // Operators
            System.out.print("Operator: ");
            operator = inputOperator.next().charAt(0);

            answer = calculate(firstField, operator, secondField);
            System.out.println("Your Answer is " + answer);
        }
    }

    public static Double calculate(Double strA, Character operator, Double strB) {

        double r = 0;

        switch (operator) {
            case '/' -> r += strA / strB;
            case '+' -> r += strA + strB;
            case '-' -> r += strA - strB;
            case '*' -> r += strA * strB;
            default -> r = 0;
        }

        return r;
    }
}