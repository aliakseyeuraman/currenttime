/**
 * Class for search value of key in section
 */
public class FindValueOfKeyInSection {
    /**
     * Find value
     *
     * @param A List of lines
     * @return value of key
     */
    public int findValue(String[] A) {
        DataInput dataInput = new DataInput();
        int value = 1;
        if (findSection(A)) {
            for (int i = 0; i < A.length; i++) {
                if (A[i].contains(dataInput.getKey())) {
                    String[] v = A[i].split("=");
                    System.out.println(v[1]);
                }
            }
            return value;
        }
        return 0;
    }

    /**
     * @param A List of arguments file
     */
    private boolean findSection(String[] A) {
        DataInput dataInput = new DataInput();
        for (int i = 0; i < A.length; i++) {
            if (A[i].contains(dataInput.getSection())) {
                return true;
            } else {
                System.out.println("Not found section!");
            }
        }
        return false;
    }

    /**
     * @param A List of arguments file
     */
    private boolean findKey(String[] A) {
        DataInput dataInput = new DataInput();
        for (int i = 0; i < A.length; i++) {
            if (A[i].contains((dataInput.getKey()))) {
                return true;
            } else {
                System.out.println("Not found key!");
            }
        }
        return false;
    }
}
