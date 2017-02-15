import java.io.IOException;

/**
 * Main class of application.
 */
public class Main extends Reader {

    /**
     * Entry point of application
     * @param args arguments of command window
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the expression:");
        String s = bufferedReader.readLine();
        Calculator calculator = new Calculator();
        System.out.println("Result ||" + "Number of operations");
        calculator.recursion(s, 0);
    }
}
