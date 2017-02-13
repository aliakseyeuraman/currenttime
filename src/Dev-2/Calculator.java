import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.Locale;

/**
 * Class considers the entered expression
 */
public class Calculator {

    /**
     * It creates a recursion to calculate expression
     * @param expression     The entered expression with the keyboard
     * @param countOperation The number of operations in the expression
     */
    public void recursion(final String expression, int countOperation) {
        //implement
        Locale.setDefault(Locale.ENGLISH);
        DecimalFormat df = new DecimalFormat("#.##");
        String value = expression.replaceAll(" ", "");
        int currentCountOperation = countOperation + 1;
        int inside = 0;
        int p1 = -1, p2 = -1, p3 = -1;
        char[] s = value.toCharArray();
        for (int i = s.length - 1; i >= 0; i--) {
            switch (s[i]) {
                case '^':
                    if (inside == 0 && p3 == -1) p3 = i;
                    break;
                case '*':
                case '/':
                    if (inside == 0 && p2 == -1) p2 = i;
                    break;
                case '+':
                case '-':
                    if (inside == 0 && p1 == -1) p1 = i;
                    break;
                case '(':
                    inside++;
                    break;
                case ')':
                    inside--;
                    break;
            }
        }
        if (p1 != -1) p2 = p1;
        if (p2 != -1) p3 = p2;
        if (p3 != -1) {
            PrintStream oldStream = System.out;
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream newStream = new PrintStream(outputStream);
            System.setOut(newStream);
            recursion(value.substring(0, p3), currentCountOperation);
            String[] part1 = outputStream.toString().split("\\s");
            currentCountOperation = currentCountOperation < Integer.parseInt(part1[1]) ? Integer.parseInt(part1[1]) : currentCountOperation;
            outputStream.reset();
            recursion(value.substring(p3 + 1), currentCountOperation);
            String[] part2 = outputStream.toString().split("\\s");
            currentCountOperation = currentCountOperation < Integer.parseInt(part2[1]) ? Integer.parseInt(part2[1]) : currentCountOperation;
            System.setOut(oldStream);
            switch (s[p3]) {
                case '^':
                    customPrint(df, Math.pow(Double.parseDouble(part1[0]), Double.parseDouble(part2[0])), countOperation, currentCountOperation);
                    return;
                case '*':
                    customPrint(df, Double.parseDouble(part1[0]) * Double.parseDouble(part2[0]), countOperation, currentCountOperation);
                    return;
                case '/':
                    customPrint(df, Double.parseDouble(part1[0]) / Double.parseDouble(part2[0]), countOperation, currentCountOperation);
                    return;
                case '+':
                    customPrint(df, Double.parseDouble(part1[0]) + Double.parseDouble(part2[0]), countOperation, currentCountOperation);
                    return;
                case '-':
                    customPrint(df, Double.parseDouble(part1[0]) - Double.parseDouble(part2[0]), countOperation, currentCountOperation);
                    return;
            }
        }
        if (s.length > 0 && s[0] == '(' && s[s.length - 1] == ')') {
            recursion(value.substring(1, s.length - 1), countOperation);
            return;
        }
        if (s.length > 5 && Character.isAlphabetic(s[0]) && s[3] == '(' && s[s.length - 1] == ')') {
            String funcName = value.substring(0, 3);
            PrintStream oldStream = System.out;
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream newStream = new PrintStream(outputStream);
            System.setOut(newStream);
            recursion(value.substring(4, s.length - 1), currentCountOperation);
            String[] part = outputStream.toString().split("\\s");
            currentCountOperation = currentCountOperation < Integer.parseInt(part[1]) ? Integer.parseInt(part[1]) : currentCountOperation;
            System.setOut(oldStream);
        }
        double n = 0d;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length && (Character.isDigit(s[i]) || s[i] == '.'); i++) {
            sb.append(s[i]);
        }
        if (sb.length() > 0) {
            n = Double.parseDouble(sb.toString());
        }
        customPrint(df, n, countOperation, countOperation);
    }

    /**
     * Console output method
     *
     * @param df                    Rounding to the second mark
     * @param v                     The final value
     * @param countOperation        The number of operations in the expression
     * @param currentCountOperation Current number of operations in the expression
     */
    private void customPrint(DecimalFormat df, double v, int countOperation, int currentCountOperation) {
        if (countOperation == 0) {
            System.out.println(df.format(v) + " " + currentCountOperation);
        } else {
            System.out.println(String.valueOf(v) + " " + currentCountOperation);
        }
    }

    public Calculator() {
        //don't delete
    }


}
