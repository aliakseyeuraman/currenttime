package CounterCriterions;

import Input.InputEfficiency;
import Input.InputMoney;
import Worker.*;

/**
 * Contains methods for pick team with maximal productivity according to given money
 */
public class CounterMaxEfficiency {
    public static int countL;
    public static int countS;
    public static int countM;
    public static int countJ;
    /**
     * Choose optimal team, which has got maximal productivity according to given money
     */
    public void Counter() {
        InputMoney in = new InputMoney();
        InputEfficiency e = new InputEfficiency();
        Junior junior = new Junior();
        Lead lead = new Lead();
        Middle middle = new Middle();
        Senior senior = new Senior();
        countL = (int)(e.eff / lead.getEfficiency());
        double l = e.eff - countL * lead.getEfficiency();
        countS = (int)(l / senior.getEfficiency());
        double s = l - senior.getEfficiency() * countS;
        countM = (int)(s / middle.getEfficiency());
        double m = s - middle.getEfficiency() * countM;
        countJ = (int)(m / junior.getEfficiency());
        double j = m - junior.getEfficiency() * countJ;
    }
}
