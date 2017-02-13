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
        System.out.println("введите математиеское выражение:");
        String s = bufferedReader.readLine();
        Calculator calculator = new Calculator();
        System.out.println("Ответ ||" + " Количество операций");
        calculator.recursion(s, 0);
    }
}
