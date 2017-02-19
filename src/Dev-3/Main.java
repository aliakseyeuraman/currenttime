import inputer.DataInput;
import outputer.Outputer;

/**
 * Entry point to the program.
 */
public class Main {
    public static void main(String[] args) {
        DataInput dataInput = new DataInput();
        dataInput.Reader();
        Outputer outP = new Outputer();
        outP.Printer();
    }
}
