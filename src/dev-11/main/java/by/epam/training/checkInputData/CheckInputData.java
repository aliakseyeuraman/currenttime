package by.epam.training.checkInputData;


import by.epam.training.bean.Draughts;
import by.epam.training.checkInputData.inputException.InputException;

/**
 *
 */
public interface CheckInputData {
    /**
     * @param draughts
     * @return
     */
    boolean check(Draughts draughts) throws InputException;
}
