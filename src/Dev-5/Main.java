import Criterions.ChooseCriterion;
import Input.InputEfficiency;
import Input.InputMoney;

import java.util.Scanner;

/**
 * Contain main.
 */
public class Main {
    static final String EXIT_OR_CONTINUE = "If you want to exit type 'Exit' or another key to start anew";
    /**
     * Entry point of program
     */
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        do {
            InputMoney m = new InputMoney();
            m.DataInput();
            InputEfficiency e = new InputEfficiency();
            e.DataInput();
            ChooseCriterion chooseCriterion = new ChooseCriterion();
            chooseCriterion.GetMenu();
            System.out.println(EXIT_OR_CONTINUE);
            str = in.nextLine();
        } while (!str.equals("Exit"));
    }
}
