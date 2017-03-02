package Input;

import Checker.CheckInputMoney;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class for input start money
 */
public class InputMoney {
    public static double money;
    static final String ERROR = "Error! You must enter only numbers, try again.";
    static final String ENTER_MONEY = "Enter money: ";

    /**
     * Input start money
     */
    public void DataInput() throws InputMismatchException {
        Scanner in = new Scanner(System.in);
        try {

            System.out.println(ENTER_MONEY);
            money = in.nextDouble();
        } catch (InputMismatchException IME) {
            System.out.println(ERROR);
            InputMoney inputMoney = new InputMoney();
            inputMoney.DataInput();

        }
        CheckInputMoney checkInputMoney = new CheckInputMoney();
        checkInputMoney.Checker();
    }
}

