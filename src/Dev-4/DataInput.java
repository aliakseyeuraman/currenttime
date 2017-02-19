import java.util.HashMap;
import java.util.Scanner;

/**
 * Class for entering text
 */
public class DataInput {
    public HashMap<String, Integer> frequencyMap = new HashMap<>();

    /**
     * Read the text in console
     * Allows entry of at least 3
     *
     * @return console string
     */
    public String Reader() {
        Scanner in = new Scanner(System.in);
        String str = "";
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter text: ");
            str = in.nextLine();
            frequencyMap.put(str, ); // TODO: make check in a separate class and call the object of this class
        }
        System.out.println("If you want to stop entering type 'Exit' or another key to continue");
        while (!str.equals("Exit")) ;
        return str;
    }
}
