import dataOutput.DataOutput;
import getDateAndTime.GetDateAndTime;

/**
 * The main class of application.
 */
public class Main {
    /**
     * Entry point of program
     *
     * @param args Format of data which user want
     */
    public static void main(String args[]) {
        GetDateAndTime getDateAndTime = new GetDateAndTime();
        getDateAndTime.Get();
        DataOutput dataOutput = new DataOutput();
        dataOutput.Output();
    }
}
