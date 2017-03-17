package by.epam.training.checkInputData;

import by.epam.training.bean.Draughts;
import by.epam.training.checkInputData.inputException.InputException;

/**
 * Interface witch includes method for check
 */
public interface CheckInputData {
    /**
     * @param draughts contain information about draught
     * @return true
     */
    boolean check(Draughts draughts) throws InputException;
}
