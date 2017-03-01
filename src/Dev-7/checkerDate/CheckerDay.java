package checkerDate;

import java.util.Arrays;

import static checkerDate.Month.*;

/**
 * Checks that entry days are matches to the days format.
 */
public class CheckerDay extends CheckerDate {

    /**
     * Checks that entry days are matches to the days format.
     *
     * @param date is entry time or date.
     * @return true if format is correct
     * @throws IllegalArgumentException
     * @throws ArrayIndexOutOfBoundsException
     */
    @Override
    public boolean checker(String[] date) throws IllegalArgumentException, ArrayIndexOutOfBoundsException {
        Month[] monthWith31Day = {JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, BECEMBER};
        Month[] monthsWith30Day = {APRIL, JUNE, SEPTEMBER, NOVEMBER};
        String str31 = Arrays.toString(monthWith31Day);
        String str30 = Arrays.toString(monthsWith30Day);
        int year = Integer.parseInt(date[2]);
        int day = Integer.parseInt((date[0]));
        try {
            if ( boolean contains = str31.indexOf(String.valueOf(date[1])) != -1 && day <= 31 && day > 0;){
                return contains;
            } else if ( contains = str30.indexOf(String.valueOf(date[1])) != -1 && day <= 30 && day > 0;){
                return contains;
            } else(Month.valueOf(String.valueOf(FEBRUARY))) {
                CheckerYear checkerYear = new CheckerYear();
                checkerYear.checkerYearIsLeap(date);
                return true;
            }
        } catch (IllegalArgumentException iae) {
            System.out.println("Error! You enter wrong format of day.");
        } catch (ArrayIndexOutOfBoundsException aioove) {
            System.out.println("Error! You do not enter anything.");
        }
        return false;
    }
}
