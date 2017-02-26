package dataOutput;

import formatter.Formatter;

/**
 * Class for output information
 */
public class DataOutput {
    /**
     * Write new string in console
     */
    public void Output() {
        Formatter formatter = new Formatter();
        String newStr = formatter.Format();
        System.out.println(newStr);
    }
}
