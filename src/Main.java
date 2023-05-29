import java.lang.Math;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Double answer = null;
        Scanner calObject = new Scanner(System.in);

        System.out.println();
        String firstField = calObject.nextLine();

        System.out.println(); // Operators
        String operator = calObject.nextLine();

        System.out.println(); // Operators
        String secondField = calObject.nextLine();

        System.out.println();
        String equals = calObject.nextLine();
        if (equals.equals("=")) {
            answer = calculate(firstField, operator, secondField);
        }

        System.out.println(answer);
    }

    public static Double calculate(String strA,  String operator, String strB) {

        double r = 0;

        switch (operator) {
            case "/":
                r += Double.parseDouble(strA) / Double.parseDouble(strB);
                break;
            case "+":
                r += Double.parseDouble(strA) + Double.parseDouble(strB);
                break;
            case "-":
                r += Double.parseDouble(strA) - Double.parseDouble(strB);
                break;
            case "*":
                r += Double.parseDouble(strA) * Double.parseDouble(strB);
                break;
            default:
                r = 0;
        }

        return r;
    }
}