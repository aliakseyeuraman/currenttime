package formatter;

import changeFormatSymbols.ChangeFormatSymbolsFrom1TO01;
import dataInput.DataInput;
import getDateAndTime.GetDateAndTime;

/**
 * Class for format string to another string, which consist information from calendar
 */
public class Formatter {
    /**
     * @return New string with data and time
     */
    public String Format() { // TODO: Create class ChangeFormatSymbolsFrom0To01. If (M < 10) { M = "0" + M}
        DataInput dataInput = new DataInput();
        String str = dataInput.Input();
        GetDateAndTime getDateAndTime = new GetDateAndTime();
        getDateAndTime.Get();
        ChangeFormatSymbolsFrom1TO01 ch = new ChangeFormatSymbolsFrom1TO01();
        String newStr = str.replaceAll("m", String.valueOf(getDateAndTime.m))
                .replace("H", String.valueOf(getDateAndTime.H))
                .replace("h", String.valueOf(getDateAndTime.h))
                .replace("s", String.valueOf(getDateAndTime.s))
                .replace("M", String.valueOf(getDateAndTime.M))
                .replace("d", String.valueOf(getDateAndTime.d))
                .replaceAll("hh", ch.Changeh())
                .replaceAll("MM", ch.ChangeM())
                .replaceAll("dd", ch.Changed())
                .replaceAll("ff", String.valueOf(getDateAndTime.ff))
                .replaceAll("gg", String.valueOf(getDateAndTime.gg))
                .replaceAll("YYY", String.valueOf(getDateAndTime.YYY))
                .replaceAll("tt", String.valueOf(getDateAndTime.tt));
        return newStr;
    }
}
