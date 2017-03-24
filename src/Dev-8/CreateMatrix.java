import java.util.Scanner;

/**
 * Class for create matrix: double[][]
 */
public class CreateMatrix {
    final String ENTER_NUMBER_OF_COLUMNS = "Enter number of columns: ";
    final String ENTER_NUMBER_OF_ROWS = "Enter number of rows: ";
    private int rows;
    private int colums;

    /**
     * @return created matrix
     */
    public double[][] create() {
        Scanner in = new Scanner(System.in);
        System.out.println(ENTER_NUMBER_OF_ROWS);
        rows = in.nextInt();
        System.out.println(ENTER_NUMBER_OF_COLUMNS);
        colums = in.nextInt();
        double[][] maxrix = new double[rows][colums];
        checkArgumentsIsLegal(rows, colums);
        return maxrix;
    }

    /**
     * Check rows and column in new matrix
     *
     * @param row
     * @param column
     */
    private void checkArgumentsIsLegal(int row, int column) {
        if (row < 0) {
            System.out.println("Illegal row index");
        }

        if (column < 0) {
            System.out.println("Illegal column index");
        }
    }
}
