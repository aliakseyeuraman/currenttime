import java.util.ArrayList;

/**
 * creation ArrayList
 */
public class ThreeOption {
    /**
     * method returns a list of the required number of options
     * @param args a list of all options
     * @param numberOption the amount required output options
     * @return return a list of the required number of options
     * @throws Exception do put option
     */
    public ArrayList<String> getOption(String[] args, int numberOption) throws Exception {
        ArrayList<String> options = new ArrayList<>();
        if (args.length == 0) {
            throw new Exception("you do not enter an option");
        }
        for (int i = 0; i < numberOption; i++) {
            int n = (int) Math.floor(Math.random() * args.length);
            options.add(args[n]);
        }
        return options;
    }
}
