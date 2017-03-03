import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Class for read file
 */
public class ReadFile {
    /**
     * @param fileName file name
     * @return List of lines
     * @throws IOException
     */
    public String[] read(String fileName) throws IOException {
        String[] A = new String[0];
        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            String s;
            for (int i = 0; i < A.length; i++) {
                while ((s = in.readLine()) != null) {
                    A[i] = s;
                }
            }
        }
        return A;
    }
}
