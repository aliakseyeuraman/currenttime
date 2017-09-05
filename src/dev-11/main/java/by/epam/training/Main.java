package by.epam.training;

import by.epam.training.findNumberOfSteps.FindNumberOfSteps;
import by.epam.training.inputData.InputData;
import by.epam.training.printResult.PrintResult;

/**
 * The main class of project
 */
public class Main {
    /**
     * Entry point of program
     *
     * @param args Not used
     */
    public static void main(String[] args) {
        InputData inputData = new InputData();
        FindNumberOfSteps findNumberOfSteps = new FindNumberOfSteps();
        PrintResult printResult = new PrintResult();
        printResult.print(findNumberOfSteps.find(inputData.input()));
    }
}
