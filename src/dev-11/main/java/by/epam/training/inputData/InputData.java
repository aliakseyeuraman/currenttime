package by.epam.training.inputData;


import by.epam.training.bean.Draughts;
import by.epam.training.checkInputData.CheckDraughts;
import by.epam.training.checkInputData.inputException.InputException;

/**
 *
 */
public class InputData extends Input {
    private static final String INPUT_COLOR = "Enter color: ";
    private static final String INPUT_FINISH_COORDINATE = "Enter finish coordinate: ";
    private static final String INPUT_START_COORDINATE = "Enter start coordinate: ";
    private static final String CHOOSE = "If you want exit type 'e' or another key to continue.";
    private static final int COUNT_OF_ATTEMPTS = 4;

    /**
     * @return
     */
    public Draughts input() {
        CheckDraughts checkDraughts = new CheckDraughts();
        Draughts draughts = new Draughts();
        boolean flag = false;
        int i = 0;
        while (!flag && i < COUNT_OF_ATTEMPTS) {
            draughts.setColor(super.input(INPUT_COLOR));
            draughts.setStartPosition(super.input(INPUT_START_COORDINATE));
            draughts.setFinishPosition(super.input(INPUT_FINISH_COORDINATE));
            try {
                flag = checkDraughts.check(draughts);
            } catch (InputException e) {
                System.out.println(e.getMessage());
                if (super.input(CHOOSE).equals("e")) {
                    flag = true;
                }
                i++;
            }
            System.out.println("You have " + (COUNT_OF_ATTEMPTS - i) + " attempt(s)!");
        }
        return draughts;
    }
}

