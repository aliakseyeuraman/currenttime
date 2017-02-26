package dataInput;

import java.util.Scanner;

/**
 * Class for input information
 */
public class DataInput {
    private static final String INPUT = "Enter format which you want.";
    private static final String USING_SYMBOLS = "Use 'ff', 's', 'm', 'h', 'hh', 'H', 'd', 'dd', " +
            " 'M', 'MM', 'YYY', 'gg', 'tt'";

    /**
     * Write string from console
     *
     * @return string from console
     */
    public String Input() {
        System.out.println(INPUT + "\n" + USING_SYMBOLS);
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        return str;
    }
}
