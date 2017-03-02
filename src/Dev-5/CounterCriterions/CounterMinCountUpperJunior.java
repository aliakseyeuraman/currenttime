package CounterCriterions;

import Input.InputMoney;
import Worker.*;

/**
 * Contains methods for pick team with minimal count of worker apper Junior to given efficiency
 */
public class CounterMinCountUpperJunior {
    public static int countL;
    public static int countS;
    public static int countM;

    /**
     * Methods for pick team with minimal count of worker apper Junior to given efficiency
     */
    public void Counter() {
        Lead lead = new Lead();
        Middle middle = new Middle();
        Senior senior = new Senior();
        countL = (int) (InputMoney.money / lead.getSalary());
        double l = InputMoney.money - lead.getSalary() * countL;
        countS = (int) (l / senior.getSalary());
        double s = l - senior.getSalary() * countS;
        countM = (int) (s / middle.getSalary());
        double m = s - middle.getSalary() * countM;
        if (m > 0) {
            System.out.println("And you have " + m + " y.e");
        }
    }
}
