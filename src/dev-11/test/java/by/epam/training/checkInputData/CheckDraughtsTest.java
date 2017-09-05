package by.epam.training.checkInputData;

import by.epam.training.bean.Draughts;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class CheckDraughtsTest {
    @Test
    public void check() throws Exception {
        CheckDraughts checkDraughts = new CheckDraughts();
        Draughts draughts = new Draughts();
        Assert.assertTrue(checkDraughts.check(draughts));
    }
}