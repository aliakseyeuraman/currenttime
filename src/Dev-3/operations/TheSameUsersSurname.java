package operations;

import user.User;
import java.util.ArrayList;

/**
 * Class responsible for the output information about same surnames
 */
public class TheSameUsersSurname {
    /**
     * Method finding users with same surname
     *
     * @param List contain information about person
     * @return name of users with same surname
     */
    public String SearcherTheSameSurname(ArrayList<User> List) {
        String name = "";
        for (int i = 0; i < List.size(); i++) {
            for (User p : List) {
                if (p.getSurname().equals(List.get(i).getSurname())) {
                    name = List.get(i).getName();
                }
            }
        }
        return name;
    }
}
