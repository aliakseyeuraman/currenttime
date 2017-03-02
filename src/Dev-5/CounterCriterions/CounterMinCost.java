package CounterCriterions;

import Input.InputMoney;
import Worker.*;

/**
 * Contains methods for pick team with minimal money according to given efficiency
 */
public class CounterMinCost {
    public static int countL;
    public static int countS;
    public static int countM;
    public static int countJ;

    /**
     * Choose optimal team, which has got minimal money according to given efficiency
     */
    public void Counter() {
        Junior junior = new Junior();
        Lead lead = new Lead();
        Middle middle = new Middle();
        Senior senior = new Senior();
        countL = (int) (InputMoney.money / lead.getSalary());
        double l = InputMoney.money - lead.getSalary() * countL;
        countS = (int) (l / senior.getSalary());
        double s = l - senior.getSalary() * countS;
        countM = (int) (s / middle.getSalary());
        double m = s - middle.getSalary() * countM;
        countJ = (int) (m / junior.getSalary());
        double j = m - junior.getSalary() * countJ;
    }
}
