package FormatDateAndTime;

/**
 * Class for print format date
 */
public class FormatDate {
    private static final String ENTER_DATA = "Enter data in d/MMMM/YYYY format";
    private static final String LINK_ON_FORMATS_TABLE = "If you do not know the table formats use this link: " +
            "https://msdn.microsoft.com/ru-ru/library/8kb3ddd4";
    private static final String CORRECT_DATA = "Format date is correct!";

    /**
     * Print format date
     */
    public void formatDate() {
        System.out.println(ENTER_DATA + "\n" + LINK_ON_FORMATS_TABLE);
    }

    /**
     * Print format time is true
     */
    public void correctFormatDate() {
        System.out.println(CORRECT_DATA);
    }
}
