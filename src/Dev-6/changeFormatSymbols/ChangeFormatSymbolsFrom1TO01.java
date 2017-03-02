package changeFormatSymbols;

import getDateAndTime.GetDateAndTime;


/**
 * Class consist method which change format from 0 to 01
 */
public class ChangeFormatSymbolsFrom1TO01 {
    GetDateAndTime getDateAndTime = new GetDateAndTime();
    public String MM;
    public String dd;
    public String hh;

    /**
     * Change format d from 1 to 01
     *
     * @return changed d
     */
    public String Changed() {

        if (getDateAndTime.d < 10) {
            dd = "0" + String.valueOf(getDateAndTime.d);
        } else dd = String.valueOf(getDateAndTime.d);
        return dd;
    }

    /**
     * Change format M from 1 to 01
     *
     * @return changed M
     */
    public String ChangeM() {
        if (getDateAndTime.M < 10) {
            MM = "0" + String.valueOf(getDateAndTime.M);
        } else MM = String.valueOf(getDateAndTime.M);
        return MM;
    }

    /**
     * Change format h from 1 to 01
     *
     * @return changed h
     */
    public String Changeh() {
        if (getDateAndTime.h < 10) {
            hh = "0" + String.valueOf(getDateAndTime.h);
        } else hh = String.valueOf(getDateAndTime.h);
        return hh;
    }
}
