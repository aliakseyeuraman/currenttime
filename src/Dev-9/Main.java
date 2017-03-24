import java.io.IOException;

/**
 * The main class of application
 */
public class Main {

    /**
     * @param args Name file which we need to read
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        DataInput dataInput = new DataInput();
        ReadFile readFile = new ReadFile();
        FindValueOfKeyInSection find = new FindValueOfKeyInSection();
        dataInput.inputSection();
        dataInput.inputKey();
        readFile.read(fileName);
        find.findValue(readFile.read(fileName));
    }
}