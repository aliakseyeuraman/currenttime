package Input;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class for input efficiency
 */
public class InputEfficiency {
    public static double eff;
    static final String ERROR = "Error! You must enter only numbers, try again.";
    static final String ENTER_EFFICIENCY = "Enter efficiency: ";

    /**
     * Input efficiency
     */
    public void DataInput() throws InputMismatchException {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println(ENTER_EFFICIENCY);
            eff = in.nextDouble();
        } catch (InputMismatchException IME) {
            System.out.println(ERROR);
            InputEfficiency inputEfficiency = new InputEfficiency();
            inputEfficiency.DataInput();
        }
    }
}
