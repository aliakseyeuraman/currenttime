package checkerTime;

/**
 * Class include method for check time
 */
public class CheckerTime {

    /**
     * Check entry time
     *
     * @param time is entry time
     * @return true if time format si correct
     */
    public boolean checker(String time) {
        if (time.matches("^([0-1]\\d|2[0-3])(:[0-5]\\d){2}$")) {
            return true;
        } else {
            System.out.println("Error! Wrong format of time. ");
        }
        return false;
    }
}
