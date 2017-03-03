import java.util.Scanner;

/**
 * Class for input section and key
 */
public class DataInput {
    static private final String INPUT_SECTION = "Enter section: ";
    static private final String INPUT_KEY = "Enter key: ";
    private String section;
    private String key;

    /**
     * Input section
     */
    public void inputSection() {
        Scanner in = new Scanner(System.in);
        System.out.println(INPUT_SECTION);
        section = in.nextLine();
    }

    /**
     * Input key
     */
    public void inputKey() {
        Scanner in = new Scanner(System.in);
        System.out.println(INPUT_KEY);
        key = in.nextLine();
    }

    /**
     *
     * @return section
     */
    public String getSection() {
        return section;
    }

    /**
     *
     * @return key
     */
    public String getKey() {
        return key;
    }
}
