/**
 * Class for multiply two matrix
 */
public class MultiplyMatrix {
    /**
     * @param matrixA first matrix which we want multiply
     * @param matrixB second matrix which we want multiply
     * @param rows    The number of rows result matrix
     * @param colums  The number of column result matrix
     * @return matrix of result
     */
    public double[][] multiply(double[][] matrixA, double[][] matrixB, int rows, int colums) {
        double[][] resultOfAddition = new double[rows][colums];
        if (matrixA.length != matrixB[0].length) {
            System.out.println("Can't multiply matrix");
        } else {
            System.out.println("Result of multiply: ");
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixA[i].length; j++) {
                    resultOfAddition[i][j] = matrixA[i][j] + matrixB[i][j];
                    System.out.print(resultOfAddition[i][j] + (j == matrixA[i].length - 1 ? "\n" : "\t"));
                }
            }
        }
        return resultOfAddition;
    }
}
