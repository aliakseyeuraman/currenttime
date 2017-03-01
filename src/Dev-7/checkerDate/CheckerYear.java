package checkerDate;

/**
 * Class include method for check year
 */
public class CheckerYear extends CheckerDate {

    /**
     * Check input year
     * @param date is entry time or date.
     * @return true if format is correct
     * @throws IllegalArgumentException
     * @throws ArrayIndexOutOfBoundsException
     */
    @Override
    public boolean checker(String[] date) throws IllegalArgumentException, ArrayIndexOutOfBoundsException {
        try {
            String year = date[2];
            if (year.length() == 4) {
                return true;
            } else {
                System.out.println("Error! You enter wrong format of year.");
            }
        } catch (IllegalArgumentException iae) {
            System.out.println("Error! You enter wrong format of year. Try again");
        } catch (ArrayIndexOutOfBoundsException ignored) {
        }
        return false;
    }

    /**
     * Check is year leap or not
     * @param date is entry date
     * @return true if year is leap
     */
    public boolean checkerYearIsLeap(String[] date) {
        int year = Integer.parseInt(date[2]);
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    // leap year
                    return Integer.parseInt(date[0]) <= 29;
                }
                // not leap year
                return Integer.parseInt(date[0]) <= 28;
            }
            // leap year
            return Integer.parseInt(date[0]) <= 29;
        } else {
            // not leap year
            return Integer.parseInt(date[0]) <= 28;
        }
    }
}
