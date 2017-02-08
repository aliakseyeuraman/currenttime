import java.util.ArrayList;

/**
 * Class serves for starting execution of the program
 */
public class Main {
    /**
     * Main class of the application. Contains the entry point
     *@param args - command line arguments
     */
    private static final int NUMBER_OPTION = 3;

    public static void main(String[] args) {
        ThreeOption threeOption;
        try {
            threeOption = new ThreeOption();
            ArrayList<String> options = threeOption.getOption(args, NUMBER_OPTION);
            for (String option : options) {
                System.out.println(option);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
