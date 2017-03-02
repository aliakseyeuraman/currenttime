package Checker;

import Input.InputMoney;
import Worker.Junior;

import java.util.Scanner;

/**
 * Class contain metod for a checking input money
 */
public class CheckInputMoney {
    /**
     * Check input money and compare with salary Junior
     */
    public void Checker() { // TODO: create exit of program in user want
        Scanner in = new Scanner(System.in);
        Junior junior = new Junior();
        String str = "";
        if (InputMoney.money < junior.getSalary()) {
            do {
                System.out.println("You have so little money that is not enough to hire a Junior. " + "\n" +
                                   "Our Junior have a salary of  " + junior.getSalary() + "\n" +
                                   "Type 'y' to try again");
                str = in.nextLine();
            } while (!str.equals("y"));
            InputMoney inputMoney = new InputMoney();
            inputMoney.DataInput();
        }
    }
}