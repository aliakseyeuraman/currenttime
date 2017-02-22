package Output;

import CounterCriterions.CounterMaxEfficiency;
import CounterCriterions.CounterMinCost;
import CounterCriterions.CounterMinCountUpperJunior;

/**
 * Class for print text
 */
public class Outputer {
    /**
     * Print text for each criterion
     */
    public void PrintTextForCaseTwo() {
        System.out.println("Lead count : " + CounterMinCost.countL + "\n" + "Senior count : " + CounterMinCost.countS
                           + "\n" + "Middle count : " + CounterMinCost.countM + "\n"
                           + "Junior count : " + CounterMinCost.countJ);
    }

    public void PrintTextForCaseOne() {
        System.out.println("Lead count : " + CounterMaxEfficiency.countL + "\n"
                           + "Senior count : " + CounterMaxEfficiency.countS
                           + "\n" + "Middle count : " + CounterMaxEfficiency.countM + "\n"
                           + "Junior count : " + CounterMaxEfficiency.countJ);
    }

    public void PrintTextForCaseThree() {
        System.out.println("Lead count : " + CounterMinCountUpperJunior.countL + "\n" + "Senior count : "
                           + CounterMinCountUpperJunior.countS
                           + "\n" + "Middle count : " + CounterMinCountUpperJunior.countM + "\n");
    }
}
