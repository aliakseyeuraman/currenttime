package checkerDate;

/**
 * Class include method for check month
 */
public class CheckerMonth extends CheckerDate {

    /**
     * Check input month
     *
     * @param month is entry date.
     * @return true if format is correct
     * @throws IllegalArgumentException
     * @throws ArrayIndexOutOfBoundsException
     */
    @Override
    public boolean checker(String[] month) throws IllegalArgumentException, ArrayIndexOutOfBoundsException {
        try {
            String date = month[1];
            Month.valueOf(date.toUpperCase());
        } catch (IllegalArgumentException iae) {
            System.out.println("Error! You enter wrong format of month.");
        } catch (ArrayIndexOutOfBoundsException ignored) {
        }
        return false;
    }
}
