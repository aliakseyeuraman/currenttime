package getDateAndTime;

import java.util.Calendar;

/**
 * Class for getting date and time
 */
public class GetDateAndTime {
    Calendar calendar = Calendar.getInstance();
    public int H;
    public int m;
    public int s;
    public int ff;
    public int d;
    public int M;
    public int YYY;
    public int h;
    public int gg;
    public int tt;

    /**
     * Get date and time
     */
    public void Get() {
        h = calendar.get(Calendar.HOUR);
        H = calendar.get(Calendar.HOUR_OF_DAY);
        m = calendar.get(Calendar.MINUTE);
        s = calendar.get(Calendar.SECOND);
        ff = calendar.get(Calendar.MILLISECOND);
        d = calendar.get(Calendar.DAY_OF_MONTH);
        M = calendar.get(Calendar.MONTH);
        YYY = calendar.get(Calendar.YEAR);
        gg = calendar.get(Calendar.ERA);
        tt = calendar.get(Calendar.AM_PM);
    }
}
