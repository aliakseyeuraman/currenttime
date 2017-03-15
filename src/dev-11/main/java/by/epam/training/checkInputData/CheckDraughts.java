package by.epam.training.checkInputData;


import by.epam.training.bean.Draughts;
import by.epam.training.checkInputData.inputException.InputException;

/**
 *
 */
public class CheckDraughts implements CheckInputData {
    private static final String INVALID_COLOR = "Please, enter 'black' or 'white'!";
    private static final String NOTHING_ENTER = "You don't enter anything";
    private static final String INVALID_COORDINATE = "";
    private static final String WRONG_COUNT_OF_SYMBOLS = "Wrong count of symbols";
    private static final String THE_SAME = "Start coordinate equals finish coordinate";

    private static final String black = "BLACK";
    private static final String white = "WHITE";

    /**
     * @param draughts
     * @return
     * @throws InputException
     */
    @Override
    public boolean check(Draughts draughts) throws InputException {
        return checkColor(draughts.getColor())
                && checkCoordinate(draughts.getStartPosition())
                && checkCoordinate(draughts.getFinishPosition())
                && checkTheSameCoordinates(draughts.getStartPosition(), draughts.getFinishPosition());
    }

    /**
     * @param color
     * @return
     * @throws InputException
     */
    private boolean checkColor(String color) throws InputException {
        boolean flag;
        if (color.equals("")) {
            throw new InputException(NOTHING_ENTER);
        } else if (color.equalsIgnoreCase(black)
                || color.equalsIgnoreCase(white)) {
            flag = true;
        } else {
            flag = false;
        }
        if (!flag) {
            throw new InputException(INVALID_COLOR);
        }
        return flag;
    }

    /**
     * @param start
     * @return
     * @throws InputException
     */
    private boolean checkCoordinate(String start) throws InputException {
        boolean flag;
        if (start.length() > 2) {
            throw new InputException(WRONG_COUNT_OF_SYMBOLS);
        } else if (start.equals("")) {
            throw new InputException(NOTHING_ENTER);
        } else if (!start.matches("[A-Ha-h][1-8]")) {
            flag = false;
        } else {
            flag = true;
        }
        if (!flag) {
            throw new InputException(INVALID_COORDINATE);
        }
        return flag;
    }

    /**
     * @param start
     * @param finish
     * @return
     * @throws InputException
     */
    private boolean checkTheSameCoordinates(String start, String finish) throws InputException {
        if (start.equals(finish)) {
            throw new InputException(THE_SAME);
        }
        return true;
    }
}
