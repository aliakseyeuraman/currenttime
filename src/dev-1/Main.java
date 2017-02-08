public class Main {
    /**
     * Main class of the application. Contains the entry point
     */
    private static final int NUMBER_OPTION = 3;

    public static void main(String[] args) {
        ThreeOption threeOption;
        try {
            threeOption = new ThreeOption();
            threeOption.getOption(args, NUMBER_OPTION);
        } catch (NotEnoughItemsException e) {
            e.getMessage();
        }
    }
}