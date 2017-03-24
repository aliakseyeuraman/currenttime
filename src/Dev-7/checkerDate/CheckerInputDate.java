package checkerDate;

import inputer.InputDataAndTime;

/**
 * Check input data for null
 */
public class CheckerInputDate {


    /**
     * Check entry data
     * @return If entry data is null retun
     */
    public boolean checker() {
        InputDataAndTime inputDataAndTime = new InputDataAndTime();
        if (inputDataAndTime.getDate() == "") {
            System.out.println("You don't enter anything!");
        }
        return true;
    }
}
