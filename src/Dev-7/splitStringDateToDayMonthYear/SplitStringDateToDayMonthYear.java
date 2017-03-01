package splitStringDateToDayMonthYear;

/**
 * Class for split string date to day month and year
 */
public class SplitStringDateToDayMonthYear {

    /**
     * @param str entry date
     * @return array of string
     */
    public String[] split(String str) {
        String[] date;
        date = str.split("/");
        return date;
    }
}
