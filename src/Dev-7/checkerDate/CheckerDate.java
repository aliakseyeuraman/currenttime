package checkerDate;

/**
 * Abstract class that defines common behavior of all checker classes.
 */
public abstract class CheckerDate {

    /**
     * Abstract method for check
     * @param date is entry time or date.
     * @return true if format is correct
     */
    public abstract boolean checker(String[] date);
}
