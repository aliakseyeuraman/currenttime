/**
 * The main class of application.
 */
public class Main {

    /**
     * Entry point of application.
     */
    public static void main(String[] args) {
        CreateMatrix createMatrix = new CreateMatrix();
        PrintMatrix printMatrix = new PrintMatrix();
        FillMaxrix fillMaxrix = new FillMaxrix();
        MultiplyMatrix multiplyMatrix = new MultiplyMatrix();
        double[][] first = createMatrix.create();
        printMatrix.print(fillMaxrix.fill(first));
        double[][] second = createMatrix.create();
        printMatrix.print(fillMaxrix.fill(second));
        multiplyMatrix.multiply(first, second, first.length, second[0].length);

    }
}
