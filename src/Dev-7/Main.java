import FormatDateAndTime.FormatDate;
import FormatDateAndTime.FormatTime;
import checkerDate.CheckerDay;
import checkerDate.CheckerInputDate;
import checkerDate.CheckerMonth;
import checkerDate.CheckerYear;
import checkerTime.CheckerTime;
import inputer.InputDataAndTime;
import splitStringDateToDayMonthYear.SplitStringDateToDayMonthYear;

/**
 * The main class of application
 */
public class Main {

    /**
     * Entry point of program
     */
    public static void main(String args[]) {
        InputDataAndTime inputDataAndTime = new InputDataAndTime();
        SplitStringDateToDayMonthYear splitString = new SplitStringDateToDayMonthYear();
        FormatDate formatDate = new FormatDate();
        FormatTime formatTime = new FormatTime();
        CheckerDay checkerDay = new CheckerDay();
        CheckerInputDate checkerInputDate = new CheckerInputDate();
        CheckerMonth checkerMonth = new CheckerMonth();
        CheckerYear checkerYear = new CheckerYear();
        formatDate.formatDate();
        inputDataAndTime.inputData();
        checkerInputDate.checker();
        checkerDay.checker(splitString.split(inputDataAndTime.getDate()));
        checkerMonth.checker(splitString.split(inputDataAndTime.getDate()));
        checkerYear.checker(splitString.split(inputDataAndTime.getDate()));
        formatTime.formatTime();
        inputDataAndTime.inputTime();
        CheckerTime checkerTime = new CheckerTime();
        checkerTime.checker(inputDataAndTime.getTime());
    }
}
