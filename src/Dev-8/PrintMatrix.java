/**
 * Class for print matrix in cpnsole
 */
public class PrintMatrix {
    /**
     * Print in console matrix
     *
     * @param matrix Matrix which we want to print
     */
    public void print(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        System.out.println("Matrix dimensions: [" + rows + "; " + cols + "]");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
