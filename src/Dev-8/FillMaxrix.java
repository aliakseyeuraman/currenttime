import java.util.Scanner;

/**
 * Fill matrix elements
 */
public class FillMaxrix {
    final String ENTER_MATRIX_ELEMENT = "Enter matrix element";

    /**
     * @param matrix matrix which we want to fill
     * @return filled matrix
     */
    public double[][] fill(double[][] matrix) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println(ENTER_MATRIX_ELEMENT);
                System.out.print("" + "[" + matrix.length + "][" + matrix[0].length + "]: ");
                matrix[i][j] = in.nextDouble();
            }
        }
        return matrix;
    }
}