package inputer;

import java.util.Scanner;

/**
 * Class for input date and time
 */
public class InputDataAndTime {
    private String time;
    private String date;

    /**
     * Input date
     */
    public void inputData() {
        Scanner in = new Scanner(System.in);
        date = in.nextLine();
    }

    /**
     * Input time
     */
    public void inputTime() {
        Scanner in = new Scanner(System.in);
        time = in.nextLine();
    }

    /**
     * @return time
     */
    public String getTime() {
        return time;
    }

    /**
     * @return date
     */
    public String getDate() {
        return date;
    }
}
