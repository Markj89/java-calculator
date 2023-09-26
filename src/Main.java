import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Java Calculator
 * @author marcusjackson
 *
 * Logic:
 *
 * Store fields in a array.
 */
public class Main {
    // REGEX
    public static final String DOUBLE_PATTERN = "[/+,-,/*,//,-]";;
    public static final String INTEGER_PATTERN = "(\\\\d+)";

    // Field
    public static ArrayList<String> fields = new ArrayList<String>();

    public static void main(String[] args) {
        System.out.println("Calculator on: \n");
        String newField = new String();
        operand(newField);

    }

    public static void operand(String digits) {
        Pattern pattern = Pattern.compile(DOUBLE_PATTERN);
        Matcher digit = pattern.matcher(digits);
        System.out.println("Write you fields... ");
        Scanner calObject = new Scanner(System.in);

        while (calObject.hasNext()) {
            System.out.println();
            if (calObject.equals("=")) {
                System.out.println("Lets calculate");
            } else {
                fields.add(calObject.next());
            }

            //int t = Integer.parseInt(digits.substring(digit.start(), digit.end()));
            //fields.add(String.valueOf(t));
        }
    }
}