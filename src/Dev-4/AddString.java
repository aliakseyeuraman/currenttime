/**
 * class for adding one string to another
 */
public class AddString {
    /**
     * Add one string to another
     *
     * @param addedStr Adding string
     * @param str string which tou add string
     * @return final string
     */
    public String addText(String addedStr, String str) {
        StringBuffer string = new StringBuffer();
        string.append(str);
        string.append(" ");
        string.append(addedStr);
        return string.toString();
    }
}
