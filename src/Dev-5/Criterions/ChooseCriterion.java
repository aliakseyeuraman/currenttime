package Criterions;

import CounterCriterions.CounterMaxEfficiency;
import CounterCriterions.CounterMinCost;
import CounterCriterions.CounterMinCountUpperJunior;
import Output.Outputer;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class provides the criterions for the choice
 */
public class ChooseCriterion {
    static final String CHOOSE_CRITERION = "Choose criterion witch you want";
    static final String CRITERION_1 = "1: Max efficiency for a fixed cost ";
    static final String CRITERION_2 = "2: The minimal cost for a fixed efficiency";
    static final String CRITERION_3 = "3: The minimal number of personnel qualifications for higher Junior fixed efficiency";
    static final String CRITERION_FOR_EXIT = " Enter 0 to exit program";
    static final String ERROR = "Error! Choose 0, 1, 2 or 3";

    /**
     * Give start menu for choose criterion
     */
    public void GetMenu() {
        System.out.println(CHOOSE_CRITERION + "\n" + CRITERION_1 + "\n" + CRITERION_2 + "\n"
                           + CRITERION_3 + "\n" + CRITERION_FOR_EXIT);
        int crit;
        Scanner in = new Scanner(System.in);
        try {
            crit = in.nextInt();
            switch (crit) {
                case 1:
                    CounterMaxEfficiency counterMaxEfficiency = new CounterMaxEfficiency();
                    counterMaxEfficiency.Counter();
                    Outputer outputer = new Outputer();
                    outputer.PrintTextForCaseOne();
                    break;
                case 2:
                    CounterMinCost counterMinCost = new CounterMinCost();
                    counterMinCost.Counter();
                    Outputer outputerTwo = new Outputer();
                    outputerTwo.PrintTextForCaseTwo();
                    break;
                case 3:
                    CounterMinCountUpperJunior counterMinCountUpperJunior = new CounterMinCountUpperJunior();
                    counterMinCountUpperJunior.Counter();
                    Outputer outputerThree = new Outputer();
                    outputerThree.PrintTextForCaseThree();
                    break;
                case 0:
                    System.exit(0);
            }
        } catch (InputMismatchException IME) {
            System.out.println(ERROR);
            ChooseCriterion chooseCriterion = new ChooseCriterion();
            chooseCriterion.GetMenu();
        }
    }
}
