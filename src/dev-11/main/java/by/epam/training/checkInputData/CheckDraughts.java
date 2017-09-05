package by.epam.training.checkInputData;

import by.epam.training.bean.Draughts;
import by.epam.training.checkInputData.inputException.InputException;

/**
 * Class for check input data
 */
public class CheckDraughts implements CheckInputData {
    private static final String INVALID_COLOR = "Please, enter 'black' or 'white'!";
    private static final String NOTHING_ENTER = "You don't enter color!";
    private static final String NOTHING_ENTER_COORDINATE = "You don't enter coordinate!";
    private static final String INVALID_COORDINATE = "You enter wrong coordinate! F.e. 'a1', 'c3', 'h8'.";
    private static final String WRONG_COUNT_OF_SYMBOLS = "Wrong count of symbols in coordinate!"
            + "F.e. 'a1', 'c3', 'h8'.";
    private static final String THE_SAME = "Start coordinate equals finish coordinate.";
    private static final int MAX_COUNT_OF_SYMBOLS = 2;

    private static final String black = "BLACK";
    private static final String white = "WHITE";

    /**
     * @param draughts contain information about draught
     * @return true if all check will be true
     * @throws InputException input exception
     */
    @Override
    public boolean check(Draughts draughts) throws InputException {
        return checkColor(draughts.getColor())
                && checkCoordinate(draughts.getStartPosition())
                && checkCoordinate(draughts.getFinishPosition())
                && checkTheSameCoordinates(draughts.getStartPosition(), draughts.getFinishPosition());
    }

    /**
     * @param color input color
     * @return true if input color will be value
     * @throws InputException input exception
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
     * @param start input coordinate
     * @return true if input coordinate will be value
     * @throws InputException input exception
     */
    private boolean checkCoordinate(String start) throws InputException {
        boolean flag;
        if (start.length() > MAX_COUNT_OF_SYMBOLS) {
            throw new InputException(WRONG_COUNT_OF_SYMBOLS);
        } else if (start.equals("")) {
            throw new InputException(NOTHING_ENTER_COORDINATE);
        } else if (!start.matches("[a-h][1-8]")) {
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
     * @param start  input start coordinate
     * @param finish input finish coordinate
     * @return true if input start coordinate will be not equals finish coordinate
     * @throws InputException input exception
     */
    private boolean checkTheSameCoordinates(String start, String finish) throws InputException {
        if (start.equals(finish)) {
            throw new InputException(THE_SAME);
        }
        return true;
    }
}
