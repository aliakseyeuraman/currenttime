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

    /**
     * @return
     */
    public Draughts input() {
        CheckDraughts checkInputColor = new CheckDraughts();
        Draughts draughts = new Draughts();
        boolean flag = false;
        while (!flag) {
            draughts.setColor(super.input(INPUT_COLOR));
            draughts.setStartPosition(super.input(INPUT_START_COORDINATE));
            draughts.setFinishPosition(super.input(INPUT_FINISH_COORDINATE));
            try {
                flag = checkInputColor.check(draughts);
            } catch (InputException e) {
                System.out.println(e.getMessage());
            }
        }
        return draughts;
    }
}
