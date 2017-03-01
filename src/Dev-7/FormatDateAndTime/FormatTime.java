package FormatDateAndTime;

/**
 * Class for print format time
 */
public class FormatTime {
    private static final String ENTER_TIME = "Enter time in HH:mm:cc format";
    private static final String LINK_ON_FORMATS_TABLE = "If you do not know the table formats use this link: " +
            "https://msdn.microsoft.com/ru-ru/library/8kb3ddd4";
    private static final String CORRECT_TIME = "Format time is correct!";

    /**
     * Print format time
     */
    public void formatTime() {
        System.out.println(ENTER_TIME + "\n" + LINK_ON_FORMATS_TABLE);
    }

    /**
     * Print format time is true
     */
    public void correctFormatDate() {
        System.out.println(CORRECT_TIME);
    }
}
