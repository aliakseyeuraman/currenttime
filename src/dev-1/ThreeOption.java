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
     * @throws NotEnoughItemsException introduced there more than 3 options
     */
    public ArrayList<String> getOption(String[] args, int numberOption) throws NotEnoughItemsException {
        ArrayList<String> options = new ArrayList<>();
        if (args.length < numberOption) {
            throw new NotEnoughItemsException("You enter less then 3 options");
        }
        for (int i = 0; i < numberOption; i++) {
            int n = (int) Math.floor(Math.random() * args.length);
            options.add(args[n]);
        }
        return options;
    }
}
